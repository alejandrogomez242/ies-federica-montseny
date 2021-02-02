package programacion.iesfm.banco;

import java.util.Objects;

public class Cuenta {
    private int numeroCuenta;
    private int saldo;

    public Cuenta(int numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void infoCuentas() {
        System.out.println("numero de cuenta: " + numeroCuenta + " y su saldo es: " + saldo);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return numeroCuenta == cuenta.numeroCuenta &&
                saldo == cuenta.saldo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta, saldo);
    }
}
