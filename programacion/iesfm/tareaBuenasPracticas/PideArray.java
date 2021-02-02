import java.util.Scanner;

public class PideArray {
    static Scanner scan = new Scanner(System.in);
    static int[] ReadNumbers() {
        System.out.print("Introduzca el tamaño del array: ");
        int n = scan.nextInt();
        while(n <= 0) {
            System.out.print("El array debe tener al menos un valor, introduzca un tamaño superior a 0: ");
            n = scan.nextInt();
        }
        int[] numbers = new int[n];
        for(int a = 0; a < n; a++) {
            numbers[a] = scan.nextInt();
        }
        return numbers;
    }

    static boolean IsValueInArray(int[] array, int value) {
        boolean found = false;
        for(int arrayNumber: array) {
            if(arrayNumber == value) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int number = 0;
        int[] numbers1 = ReadNumbers();
        int[] numbers2 = ReadNumbers();

        for(int i = 0; i < numbers1.length; i++) {
            int number1 = numbers1[i];
            for(int j = 0; j < numbers2.length; j++) {
                int number2 = numbers2[j];
                if(number1 == number2) {
                    System.out.println(number1);
                }
            }
        }

        for(int h=0; h<numbers1.length;h++) {
            number = numbers1[h];
            if(IsValueInArray(numbers2, number)) {
                System.out.println(number);
            }
        }
    }
}
