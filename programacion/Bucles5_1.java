package programacion;

import java.util.Scanner;

public class Bucles5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int number = scan.nextInt();
        int contador = 0;
        while (number >= 0) {
            System.out.println("Introduza otro numero: ");
            number = scan.nextInt();
            contador++;
        }
        System.out.println("Se han introducido " + contador);
    }
}