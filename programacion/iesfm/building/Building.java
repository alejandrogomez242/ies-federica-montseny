package programacion.iesfm.building;

import java.util.Arrays;
import java.util.Objects;

public class Building implements IBuilding {
    private String address;
    private String city;
    private Apartment[] apartments;

    public Building(String address, String city, Apartment[] apartments) {
        this.address = address;
        this.city = city;
        this.apartments = apartments;
    }

    @Override
    public void showInfoBuilding() {
        System.out.println("El edificio se encuentra en " + address + " , el edificio se encuentra en la ciudad " + city);
        for (int i = 0; i < apartments.length; i++) {
            Apartment[] apartments = new Apartment[i];
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(city, building.city) && Arrays.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(address, city);
        result = 31 * result + Arrays.hashCode(apartments);
        return result;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
