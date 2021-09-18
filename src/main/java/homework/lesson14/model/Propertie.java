package homework.lesson14.model;

public class Propertie {
    private String type;
    private String address;
    private Double price;

    public Propertie() {
    }

    public Propertie(String type, String address, Double price) {
        this.type = type;
        this.address = address;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public Propertie setType(String type) {
        this.type = type;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Propertie setAddress(String address) {
        this.address = address;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Propertie setPrice(Double price) {
        this.price = price;
        return this;
    }
}
