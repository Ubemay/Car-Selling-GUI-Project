package CarSellingProject;

import java.io.Serializable;
import java.util.ArrayList;

public class Car implements Serializable {

    private int id;
    private String brand;
    private String model;
    private String country;
    private int price;

    private ArrayList<Car> cars = new ArrayList<>();

    public Car(String brand, String model, String country, int price) {
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.price = price;
    }

    public Car(Integer id, String brand, String model, String country, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return brand + " " + model + '\'' +
                ", Country: " + country + '\'' +
                ", Price: " + price
                + "\n";
    }
}
