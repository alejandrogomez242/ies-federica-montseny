package programacion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int numero) {
        int resultado = 1;
        for(int i = 0; i < numero; i++) {
            resultado = resultado * 1;
        } return resultado;

    }
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(factorial(num));
    }
}
