package programacion;

import java.util.Scanner;

public class Bucle_Sumatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int respuesta = scan.nextInt();
        int suma = respuesta;
        while (respuesta != 0) {
            System.out.print("Introduce un numero: ");
            respuesta = scan.nextInt();
            suma = suma + respuesta;
        }
        System.out.println("Has introducido " + suma + " numeros");
    }
}



