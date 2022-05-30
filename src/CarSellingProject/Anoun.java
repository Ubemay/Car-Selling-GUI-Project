package CarSellingProject;

public class Anoun {

    private int id;
    private String name;
    private String model;
    private String country;
    private int price;

    public Anoun() {
    }

    public Anoun(String name, String model, String country, int price) {
        this.name = name;
        this.model = model;
        this.country = country;
        this.price = price;
    }

    public Anoun(int id, String name, String model, String country, int price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.country = country;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
