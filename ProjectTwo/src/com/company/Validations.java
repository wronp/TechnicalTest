package com.company;

import java.util.List;

public class Validations {

    public static int maximumCapacity = 18000;

    public double AddingWeigth(List<Double> cargo, double lump) {

        double sum = 0;
        for (int i = 0; i < cargo.size(); i++) {
            sum += cargo.get(i);

        }

        if (sum > maximumCapacity) {
            System.out.println("Not enough space!");
            return (maximumCapacity - sum);
        } else {
            System.out.println("Available space: " + (maximumCapacity - sum));
            return sum;
        }

    }
}
