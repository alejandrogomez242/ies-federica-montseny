package programacion.iesfm.instituto;

import java.util.Objects;

public class Instituto {
    private String nombre;

    public void infoInstituto() {
        System.out.println("El nombre del instituto es " + nombre);
    }

    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
