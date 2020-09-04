package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {


    /*
    *
    * 1. Determine el valor de un pasaje en avión, conociendo la distancia a recorrer, el número de
         días de estancia, y sabiendo que, si la distancia a recorrer es superior a 1000 Km y el
         número de días de estancia es superior a 7, la línea aérea le hace un descuento del 30%.
         (el precio por km. es de $35.00).
    *
    * */

    static Scanner s = new Scanner(System.in);

    public static void Travel(){

    UserData user1 = new UserData();
    Discount discount = new Discount();
        System.out.print("Enter your name: ");
        user1.setUserName(s.nextLine());

        System.out.println("Select where will you like to travel?");
        System.out.println("1. Panama  \n" +
                "2. Mexico  \n" +
                "3. United States  \n" +
                "4. Ecuador  \n" +
                "5. Spain  \n" +
                "6. To end the selection. \n");
        System.out.print("Add your destination: ");
        int userSelection = parseInt(s.nextLine());

        switch (userSelection){
            case 1:
                user1.setNumberKilometers(705);
                discount.TravelQuote(user1);
                break;
            case 2:
                user1.setNumberKilometers(3700);
                discount.TravelQuote(user1);
                break;
            case 3:
                user1.setNumberKilometers(4200);
                discount.TravelQuote(user1);
                break;
            case 4:
                user1.setNumberKilometers(832);
                discount.TravelQuote(user1);
                break;
            case 5:
                user1.setNumberKilometers(8000);
                discount.TravelQuote(user1);
                break;
            case 6:
                System.out.println("Thank you for select Colombia Airline, see you soon.");
                break;
            default:
                System.out.println("Error, Try again to make the selection.");
                Travel();
                break;
        }
    }

    public static void main(String[] args) {

        System.out.println("\tHello Sofka \n" +
                "\tWelcome to Colombia Airline \n");
        Travel();

    }
}
