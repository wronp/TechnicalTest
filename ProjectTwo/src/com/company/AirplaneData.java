package com.company;

public class AirplaneData {

    private double lump;
    private double CargoValue;

    public AirplaneData(double lump, double cargoValue) {
        this.lump = lump;
        CargoValue = cargoValue;
    }

    public double getLump() {
        return lump;
    }

    public void setLump(double lump) {
        this.lump = lump;
    }

    public double getCargoValue() {
        return CargoValue;
    }

    public void setCargoValue(double cargoValue) {
        CargoValue = cargoValue;
    }
}
