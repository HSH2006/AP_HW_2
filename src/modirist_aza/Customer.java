package modirist_aza;

public class Customer extends Person {
    private String customerId;
    private int loyaltyPoints;
    private static int customerCounter = 1;

    public Customer(String name, String phoneNumber) {
        super(name, phoneNumber);
        if (customerCounter < 10)
            this.customerId = "C00" + customerCounter;
        else if (customerCounter < 100)
            this.customerId = "C0" + customerCounter / 10 + customerCounter;
        else
            this.customerId = "C" + customerCounter / 100 + customerCounter / 10 + customerCounter;
        customerCounter++;
        this.loyaltyPoints = 0;
    }

    public void addLoyaltyPoints(double orderAmount) {
        if (orderAmount > 1000000) {
            loyaltyPoints += 2;
        } else if (orderAmount > 500000) {
            loyaltyPoints += 1;
        }
    }

    public double getDiscount() {
        if (loyaltyPoints > 5)
            return 0.10;
        else if (loyaltyPoints > 3)
            return 0.05;
        return 0.0;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getInfo() {
        return ("ID: " + customerId + ", Name: " + getName()+", Phone: " + getPhoneNumber() +", Loyalty Points: " +
                loyaltyPoints);
    }
}
