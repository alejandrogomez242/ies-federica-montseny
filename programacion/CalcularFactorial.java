package programacion;

import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        int factorial = 1;
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = scan.nextInt();
        for(int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}