package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AirplaneCargo {
 
    Scanner s = new Scanner(System.in);
    Validations v = new Validations();
    public void AddingCargo(){

        int lumpNumber;
        ArrayList<Double> weightCargo = new ArrayList<Double>();
        System.out.print("Add the number of the packages you want to send with us: ");
        lumpNumber = Integer.parseInt(s.nextLine());

        for (int i = 0; i < lumpNumber; i++){
            double plusCargo = 0;
            System.out.print("Add the package " + (i+1) +": ");
            plusCargo = plusCargo + Double.parseDouble(s.nextLine());
            weightCargo.add(plusCargo);
            System.out.println(v.AddingWeigth(weightCargo, lumpNumber));
        }
    }
}
