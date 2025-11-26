package modiriat_meno;

public class Beverage extends MenuItem {
    private String size;
    private String temperature;

    public Beverage(String name, double price, String size, String temperature) {
        super(name, price, "Beverage");
        this.size = size;
        this.temperature = temperature;
    }

    public String getDetails() {
        return "ID: " + getItemId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory() +
                ", Size: " + size + ", Temperature: " + temperature;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
