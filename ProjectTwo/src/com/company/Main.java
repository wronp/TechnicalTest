package com.company;

public class Main {

    /*
    *
    * 2. Un BOING 747 tiene una capacidad de carga para equipaje de aproximadamente 18.000 kg.
         Confeccione un algoritmo que controle la recepción de equipajes para este avión, sabiendo que:

            A. Un bulto no puede exceder la capacidad de carga del avión ni tampoco exceder los 500 Kg.
            B. El valor por kilo del bulto es:
                - de 0 a 25 Kg. cero pesos
                - de 26 a 300 Kg. 1500 pesos por kilo de equipaje.
                - de 301 a 500 Kg. 2500 pesos por kilo de equipaje.
            C. Para un vuelo cualquiera se pide:
                a) Número total de bultos ingresados para el vuelo
                b) Peso del bulto más pesado y del más liviano.
                c) Peso promedio de los bultos.
                d) Ingreso en pesos y en dólares por concepto de carga. Construya una tabla de
                   seguimiento con no menos de 15 bultos para realizar la prueba del algoritmo.
    *
    * */


    public static void main(String[] args) {

        AirplaneCargo a = new AirplaneCargo();
        a.AddingCargo();
    }
}
