package sefareshat;

import modirist_aza.Customer;
import modiriat_meno.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 1;

    private String orderId;
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount;

    public Order(Customer customer) {
        this.orderId = String.valueOf(orderCounter);
        orderCounter++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void calculateTotal() {
        double ans = 0.0;
        for (MenuItem item : items)
            ans += item.getPrice();
        customer.addLoyaltyPoints(ans);
        this.totalAmount = ans * (1 - customer.getDiscount());
    }

    public String getOrderSummary() {
        String summary = "Order ID: " + orderId + ", Customer: " + customer.getName() + ", Total Amount: " + totalAmount
                + "\nItems: ";

        for (int i = 0; i < items.size(); i++) {
            if (i > 0) {
                summary += (" - ");
            }
            summary += (items.get(i).getName());
        }

        return summary;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return new ArrayList<>(items);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
