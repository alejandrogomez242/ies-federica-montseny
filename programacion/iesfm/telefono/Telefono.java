package programacion.iesfm.telefono;

public class Telefono {
    private String marca;
    private String modelo;
    private int precio;
    private int stock;

    public Telefono(String modelo, String marca, int precio, int stock) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public Telefono(String modelo, String marca, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.stock = 10;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void HayStock() {
        boolean comprobador = false;
        if (getStock() <= 0 ) {
            comprobador = false;
        } else {
            setStock(getStock() -1);
            System.out.println("Has comprado un " + getModelo() + " modelo " + getMarca() + " y te hemos cobrado sus " + getPrecio() + "€" + ". Nos quedan en stock " + getStock() + " " + getModelo());
        }
        System.out.println("Gracias por su compra :)");
    }
}

