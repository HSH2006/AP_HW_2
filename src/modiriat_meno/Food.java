package modiriat_meno;

public class Food extends MenuItem {
    private String spiceLevel;
    private int preparationTime;

    public Food(String name, double price, String spiceLevel, int preparationTime) {
        super(name, price, "food");
        this.spiceLevel = spiceLevel;
        this.preparationTime = preparationTime;
    }

    public String getDetails() {
        return "ID: " + getItemId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory() +
                ", Spice: " + spiceLevel + ", Preparation Time: " + preparationTime + "min";
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}
