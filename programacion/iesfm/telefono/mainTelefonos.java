package programacion.iesfm.telefono;

public class mainTelefonos {
    public static void main(String[] args) {
        Telefono Iphone = new Telefono("Iphone", "XS Max", 20000, 7);
        Telefono Samsung = new Telefono("Samsung", "S20 Ultra", 528, 19);
        Telefono Nokia = new Telefono("Nokia", "3310", 810000, 1);

        System.out.println("El nombre del producto es: " + Iphone.getModelo());
        System.out.println("El nombre del producto es: " + Samsung.getModelo());
        System.out.println("El nombre del producto es: " + Nokia.getModelo());

        System.out.println("La marca del " + Iphone.getModelo() + " es: " + Iphone.getMarca());
        System.out.println("La marca del " + Samsung.getModelo() + " es: " + Samsung.getMarca());
        System.out.println("La marca del " + Nokia.getModelo() + " es: " + Nokia.getMarca());

        System.out.println("El " + Iphone.getModelo() + " " + Iphone.getMarca() + " cuesta " + Iphone.getPrecio() + "€");
        System.out.println("El " + Samsung.getModelo() + " " + Samsung.getMarca() + " cuesta " + Samsung.getPrecio() + "€");
        System.out.println("El " + Nokia.getModelo() + " " + Nokia.getMarca() + " cuesta " + Nokia.getPrecio() + "€");

        System.out.println("Y tenemos en stock " + Iphone.getStock() + " moviles en total");
        System.out.println("Y tenemos en stock " + Samsung.getStock() + " moviles en total");
        System.out.println("Y tenemos en stock " + Nokia.getStock() + " moviles en total");

        Iphone.HayStock();
        Samsung.HayStock();
        Nokia.HayStock();
    }
}