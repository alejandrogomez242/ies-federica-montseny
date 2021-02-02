import java.text.Format;
import java.util.Scanner;

public class BuclesAnidados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca número un mayor que 1");
        int n = scan.nextInt();
        if (n < 1) {
            System.out.println("Introduzca número un mayor que 1");
        } else {
            System.out.println("Correcto");
        }

        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                num = i + j;
                System.out.println(num);
            }
        }
    }
}
