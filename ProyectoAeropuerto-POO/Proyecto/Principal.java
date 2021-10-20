package Proyecto;

import java.util.Scanner;

public class Principal {
    static Scanner leer = new Scanner(System.in);
    final static int numAeropuertos = 4;
    static Aeropuerto[] aeropuertos = new Aeropuerto[numAeropuertos];

    public static  void insertarDatosAeropuetos(Aeropuerto[] aero){
        aero[0]= new AeropuertoPublico("El plumerillo", "Mendoza", "Argentina", 8000000)
        
    }
    public static void main(String[] args) {

    }
}
