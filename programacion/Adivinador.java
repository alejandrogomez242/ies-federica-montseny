package programacion;

import java.util.Scanner;

public class Adivinador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) ((Math.random() * 100)+1);
        int b;
        int i;
        System.out.println("Vamos a ver si puedes adivinar mi numero: ");
        b = sc.nextInt();
        for (i = 0; i <= 4; i++) {
            if (i == 4) {
                System.out.println("Uyy ¡casi, lo siento pero has perdido!. El número era el: " + a);
            }
        }
    }
}
