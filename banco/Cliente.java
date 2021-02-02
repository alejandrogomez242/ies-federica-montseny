package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;


public class Cliente {
    private String nombre;
    private String nif;
    private Cuenta[] cuentas;

    public Cliente(String nombre, String nif, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.nif = nif;
        this.cuentas = cuentas;
    }

    public void imprimeClientes() {
        System.out.println("El nombre de su cliente es: " + nombre + " , cuyo NIF es " + nif + " y tiene estas cuentas " + cuentas);
    }

    public void imprimirCuentas() {
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta cuenta = cuentas[i];
            cuenta.infoCuentas();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(nif, cliente.nif) &&
                Arrays.equals(cuentas, cliente.cuentas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, nif);
        result = 31 * result + Arrays.hashCode(cuentas);
        return result;
    }
}
