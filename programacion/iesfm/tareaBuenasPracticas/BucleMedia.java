public class BucleMedia {
    // Cálculo de la media
    static double getAvg(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum = sum + number;
        }
        double res = sum / numbers.length;

        return res;
    }

    public static void main(String[] args) {
        double[] numbers = new double[args.length];
        if (args.length > 0) {
            double number = 0;
            for (int i = 0; i < args.length; i++) {
                number = Double.parseDouble(args[i]); numbers[i] = number;
                numbers[i] = number;
            }
            System.out.println("La media es " + getAvg(numbers));
        } else {
            System.out.println("Añade los argumentos");
        }
    }
}
