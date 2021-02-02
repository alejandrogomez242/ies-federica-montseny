package programacion;

import java.util.Scanner;

public class Bucles7_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Elige que quieres: sumar, restar o multiplicar");
        String operacion = scan.next();
        System.out.println("Introduce un numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Vuelve a introducir otro numero: ");
        int numero2 = scan.nextInt();

        if(operacion.equals("sumar")) {
            int suma = numero1 + numero2;
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
        } else if (operacion.equals("restar")) {
            int resta = numero1 - numero2;
            System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual a " + resta);
        } else if (operacion.equals("multiplicar")) {
            int multiplicar = numero1 * numero2;
            System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es igual a " + multiplicar);
        }
    }
}
