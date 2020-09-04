package com.company;

public class UserData {

    private String userName;
    private int numberKilometers;
    private int numbersOfVisitDays;
    private double travelValue;

    public UserData() {
        this.userName = userName;
        this.numberKilometers = numberKilometers;
        this.numbersOfVisitDays = numbersOfVisitDays;
        this.travelValue = travelValue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumberKilometers() {
        return numberKilometers;
    }

    public void setNumberKilometers(int numberKilometers) {
        this.numberKilometers = numberKilometers;
    }

    public int getNumbersOfVisitDays() {
        return numbersOfVisitDays;
    }

    public void setNumbersOfVisitDays(int numbersOfVisitDays) {
        this.numbersOfVisitDays = numbersOfVisitDays;
    }

    public double getTravelValue() {
        return travelValue;
    }

    public void setTravelValue(double travelValue) {
        this.travelValue = travelValue;
    }
}
