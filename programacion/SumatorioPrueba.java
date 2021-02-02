package programacion;

import java.util.Scanner;

public class SumatorioPrueba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero1 = scan.nextInt();
        int numero2 = numero1 * numero1;
        for (int i = 0; i <= numero1; i++) {
            System.out.println(numero1 + numero2);
        }
    }
}
