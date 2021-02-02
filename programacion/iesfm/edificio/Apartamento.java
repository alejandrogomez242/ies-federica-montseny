package programacion.iesfm.edificio;

import java.util.Arrays;
import java.util.Objects;

public class Apartamento {
    private int piso;
    private String puerta;
    private Propietario[] propietarios;

    public Apartamento(int piso, String puerta, Propietario[] propietarios) {
        this.piso = piso;
        this.puerta = puerta;
        this.propietarios = propietarios;
    }

    public void info() {
        System.out.println("El piso es: " + piso);
        System.out.println("La puerta es: " + puerta);
        for (Propietario propietario:propietarios) {
            propietario.info();
        }
    }


    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Propietario[] getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario[] propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return piso == that.piso &&
                Objects.equals(puerta, that.puerta) &&
                Arrays.equals(propietarios, that.propietarios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(piso, puerta);
        result = 31 * result + Arrays.hashCode(propietarios);
        return result;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "piso=" + piso +
                ", puerta='" + puerta + '\'' +
                ", propietarios=" + Arrays.toString(propietarios) +
                '}';
    }
}
