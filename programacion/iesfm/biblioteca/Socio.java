package programacion.iesfm.biblioteca;

import java.util.Objects;

public class Socio {
    private String nif;
    private int numeroSocio;
    private String nombre;
    private String apellidos;
    private int codigoPostal;

    public Socio(String nif, int numeroSocio, String nombre, String apellidos, int codigoPostal) {
        this.nif = nif;
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigoPostal = codigoPostal;
    }

    public void infoMember() {
        System.out.println("Member info: " + nombre + " , con apellidos " + apellidos + " , con NIF " + nif + " ,cuyo numero de socio es " + numeroSocio + " y su codigo postal es " + codigoPostal);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        Socio socio = (Socio) o;
        return numeroSocio == socio.numeroSocio &&
                codigoPostal == socio.codigoPostal &&
                Objects.equals(nif, socio.nif) &&
                Objects.equals(nombre, socio.nombre) &&
                Objects.equals(apellidos, socio.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, numeroSocio, nombre, apellidos, codigoPostal);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nif='" + nif + '\'' +
                ", numeroSocio=" + numeroSocio +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
