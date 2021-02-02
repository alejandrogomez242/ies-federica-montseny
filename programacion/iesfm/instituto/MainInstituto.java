package programacion.iesfm.instituto;

import java.util.Scanner;

public class MainInstituto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digame como se llama su instituto: ");
        String nombreInstituto = scan.next();
        System.out.println("Muy bien sigamos. Ahora digame cuantos alumnos quiere meter en su grupo: ");
        int grupoAlumnos = scan.nextInt();
        System.out.println("De acuerdo meteremos " + grupoAlumnos + " alumnos en su grupo");
        System.out.println("Ahora digame el nombre de sus alumnos: ");
        String nombre = scan.next();
        System.out.println("Y su apellido tambien: ");
        String apellido = scan.next();
        System.out.println("Ok, ultima pregunta, cual es el codigo postal de su alumno: ");
        int codigoPostal = scan.nextInt();
        System.out.println("Muy bien, vamos a recapitular todo lo que me ha dicho. Bien, entonces me dice que su instituto se llama " + nombreInstituto + " y tiene en total " + grupoAlumnos + " alumnos metidos en su grupo y que sus nombres, apellidos y codigo postal son " + nombre + " " + apellido + " " + codigoPostal);
    }
}
