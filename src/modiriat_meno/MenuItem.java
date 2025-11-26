package modiriat_meno;

public abstract class MenuItem {
    private String itemId;
    private String name;
    private double price;
    private String category;
    private static int itemCounter = 1;

    public MenuItem(String name, double price, String category) {
        this.itemId = String.valueOf(itemCounter);
        itemCounter++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract String getDetails();

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
