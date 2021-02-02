public class Bucles {
    public static void main(String[] args) {
        double[] numbers = {2.1, 4.2, 5.3};
        double product = 0;
        for (int i = 0; i < numbers.length; i++)
            product = product + numbers[i];
            product = product / numbers.length;
        System.out.println("la media es " + product);
    }
}

