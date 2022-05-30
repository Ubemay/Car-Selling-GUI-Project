package CarSellingProject;

import java.io.Serializable;

public class AutoParts implements Serializable {

    private int id;
    private String autoPartsName;
    private String description;
    private int price;

    public AutoParts() {
    }

    public AutoParts(String autoPartsName, String description, int price) {
        this.autoPartsName = autoPartsName;
        this.description = description;
        this.price = price;
    }

    public AutoParts(Integer id, String autoPartsName, String description, int price) {
        this.id = id;
        this.autoPartsName = autoPartsName;
        this.description = description;
        this.price = price;
    }

    public String getAutoPartsName() {
        return autoPartsName;
    }

    public void setAutoPartsName(String autoPartsName) {
        this.autoPartsName = autoPartsName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Name of auto part: " + autoPartsName + '\n' +
                "Description: " + description + '\n' +
                "Price: " + price + '\n';
    }
}
