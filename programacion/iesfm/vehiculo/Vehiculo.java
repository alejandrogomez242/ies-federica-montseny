package programacion.iesfm.vehiculo;

import java.util.Arrays;
import java.util.Objects;

public class Vehiculo {
    private Vehiculo[] vehiculos;
    private int color;
    private String matricula;
    private int velocidad;

    public Vehiculo(Vehiculo[] vehiculos, int color, String matricula, int velocidad) {
        this.vehiculos = vehiculos;
        this.color = color;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public void infoVehiculo() {
        for (Vehiculo vehiculo: vehiculos) {
            vehiculo.info();
        }
    }

    public void info() {
        System.out.println("El vehiculo que ha escogido es " + vehiculos + " , tiene una velocidad maxima de " + velocidad + " , es de color " + color + " y su matricula es " + matricula);
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return color == vehiculo.color &&
                velocidad == vehiculo.velocidad &&
                Arrays.equals(vehiculos, vehiculo.vehiculos) &&
                Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color, matricula, velocidad);
        result = 31 * result + Arrays.hashCode(vehiculos);
        return result;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vehiculos=" + Arrays.toString(vehiculos) +
                ", color=" + color +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
