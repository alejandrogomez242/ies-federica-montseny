package programacion.iesfm.instituto;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private int codigoPostal;

    public void infoAlumno() {
        System.out.println("El nombre del alumno es " + nombre + " , con su apellido " + apellido + " y con su codigo postal que es " + codigoPostal);
    }

    public Alumno(String nombre, String apellido, int codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return codigoPostal == alumno.codigoPostal &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellido, alumno.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, codigoPostal);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
