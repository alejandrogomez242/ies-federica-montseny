package programacion;

import java.util.Scanner;

public class BuclesAnidados2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cuantos * quieres?: ");
        int a = scan.nextInt();
        for (int i = 0; i< scan.nextInt(); i++) {
            System.out.println(i);
        }
    }
}
