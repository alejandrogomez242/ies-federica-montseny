package programacion.iesfm.vehiculo;

import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el tipo de vehiculo: ");
        String tipoVehiculo = scan.next();
        System.out.println("Introduzca el color para su " + tipoVehiculo);
        String color = scan.next();
        System.out.println("Introduca la matricula: ");
        String matricula = scan.next();
        System.out.println("Y por ultima digame la velocidad maxima de su " + tipoVehiculo);
        int velocidadMaxima = scan.nextInt();
        System.out.println("Muy bien a seleccionado un " + tipoVehiculo + " , cuyo color es " + color + " , su matricula es " + matricula + " y corre a " + velocidadMaxima);
    }
}
