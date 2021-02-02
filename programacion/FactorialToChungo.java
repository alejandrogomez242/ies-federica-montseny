package programacion;

public class FactorialToChungo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Debe haber 2 argumentos:");
        } else {
            int v1 = Integer.parseInt(args[0]);
            int v2 = Integer.parseInt(args[1]);
            if (v1 <= 1 && v2 <= 1 ) {
                System.err.println("Los argumentos tienen que ser mayores que 1:");
            } else if (v1 > v2) {
               int resultado = 1;
                for (int i = v1; i <= v2; i++) {
                    resultado = resultado * i;
                    System.out.println(resultado);
                }
            } else if (v1 < v2) {
                int resultado = 1;
                for (int i = v2; i < v1; i++) {
                    resultado = resultado * i;
                    System.out.println(resultado);
                }
            }
        }
    }
}
