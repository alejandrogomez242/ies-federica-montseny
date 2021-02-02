package programacion;

import javax.swing.*;

public class EjerciciosEclipse2 {
    public static void main(String[] args) {
        // FIXME Auto-generated method stub
        String[] listaAlumnos = {"Alejandro", "Carlos", "Giro"};
        int valor = (int) (Math.random() * listaAlumnos.length);
        JOptionPane.showMessageDialog(null, valor + " : " + listaAlumnos[valor]);
    }
}
