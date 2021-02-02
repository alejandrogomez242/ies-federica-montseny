package programacion;

import java.util.Random;

public class SelectRandow {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());

        String[] nombres = {
                "Alejandro",
                "Nicolas",
                "Fernando",
                "Adrian",
                "Jorge",
                "La Pipi",
                "Sandra",
        };
        System.out.println(nombres);
    }
}
