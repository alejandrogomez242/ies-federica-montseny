package programacion;

public class BuclesRecuperacion {

    public static void main(String[] args) {
        double[] numeros = {2.1, 3.2, 5.3};
         {
            double media = 0;

            for (int k = 0; k < numeros.length; k++) {
                media = media + numeros[k];
            }

            media = media / numeros.length;

            System.out.println(media);

        }
    }

}
