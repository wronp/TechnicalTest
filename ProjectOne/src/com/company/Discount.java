package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Discount {

    private static double kilometerValue = 35;
    Scanner s = new Scanner(System.in);
    UserData userData = new UserData();



    public double TravelQuote(UserData userData){

        double travelValue = 0;
        System.out.print("How many days are you going to travel: ");
        userData.setNumbersOfVisitDays(parseInt(s.nextLine()));
        userData.setTravelValue(userData.getNumberKilometers() * kilometerValue);
        if(userData.getNumberKilometers() > 1000 || userData.getNumbersOfVisitDays() > 7){
            travelValue = 30 * userData.getTravelValue() / 100;
            System.out.println("Hello " +userData.getUserName()+ ", your travel cost its " + (userData.getTravelValue() - travelValue) + " With a discount for travel more than seven days.");
            userData.setTravelValue(userData.getTravelValue() - travelValue);
            return userData.getTravelValue();
        }else {
            System.out.println("Hello "+ userData.getUserName()+", your travel cost its: " + userData.getTravelValue() );
            return userData.getTravelValue();
        }

    }


}
