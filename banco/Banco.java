package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;

public class Banco implements IBanco{
    private String nombre;
    private Cliente[] clientes;

    public Banco(String nombre, Cliente[] clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    @Override
    public void imprimeClientes() {
        for (Cliente cliente: clientes) {
            cliente.imprimeClientes();
        }
    }

    @Override
    public void imprimirCuentas(String nif) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            if (cliente.getNif().equals(nif)) {
                encontrado = true;
                cliente.imprimirCuentas();
            }
        }
        if (!encontrado) {
            System.out.println("no se ha encontrado al cliente");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nombre, banco.nombre) &&
                Arrays.equals(clientes, banco.clientes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(clientes);
        return result;
    }
}
