package programacion;

import java.util.Scanner;

public class Bucles4_3 {
    static Scanner scan = new Scanner(System.in);

    static void pares() {
        System.out.print("Escriba un numero par: ");
        int x = scan.nextInt();
        while (x % 2 != 0) {
            System.out.print(x + " no es un numero par. Intentelo de nuevo: ");
            x = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        pares();
            System.out.print("Escriba un numero par: ");
        System.out.print("¿Quieres escribir otro numero par? (S/N): ");
        String repeat = scan.next();
        int numPares = 0;
        while(repeat.equals("S")) {
            pares();
            System.out.print("¿Quieres escribir otro numero par? (S/N): ");
            repeat = scan.next();
            numPares ++;
        }
        System.out.println("Se han introducido " + numPares + " numero pares");
    }
}


