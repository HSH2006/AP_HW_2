import java.util.ArrayList;
import sefareshat.*;
import modirist_aza.*;
import modiriat_meno.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee ashpaz = new Employee("ashpaz", "09123456789", "آشپز", 6000000);
        Employee hesabdar = new Employee("hesabdar", "09129876543", "حسابدار", 4500000);
        Employee garson = new Employee("garson", "09351234567", "پیشخدمت", 3500000);

        ashpaz.addHoursWorked(185);
        hesabdar.addHoursWorked(160);
        garson.addHoursWorked(175);

        Customer customer1 = new Customer("customer1", "09011223344");
        Customer customer2 = new Customer("taha", "09122334455");
        Customer customer3 = new Customer("hossein", "09233445566");
        Customer customer4 = new Customer("customer4", "09344556677");
        Customer customer5 = new Customer("customer5", "09455667788");

        Food pizza = new Food("pizza", 450000, "Medium", 20);
        Food pasta = new Food("pasta", 320000, "Mild", 15);
        Food burger = new Food("burger", 280000, "Spicy", 12);
        Food salad = new Food("salad", 180000, "Mild", 8);
        Food steak = new Food("steak", 680000, "Medium", 25);
        Food sushi = new Food("sushi", 550000, "Mild", 18);

        Beverage tea = new Beverage("tea", 50000, "medium", "hot");
        Beverage coffee = new Beverage("coffee", 80000, "small", "hot");
        Beverage cola = new Beverage("cola", 60000, "large", "cold");
        Beverage juice = new Beverage("juice", 70000, "medium", "cold");
        Beverage smoothie = new Beverage("smoothie", 120000, "large", "cold");

        Order order1_1 = new Order(customer1);
        order1_1.addItem(pizza);
        order1_1.addItem(cola);
        order1_1.calculateTotal();

        Order order1_2 = new Order(customer1);
        order1_2.addItem(steak);
        order1_2.addItem(coffee);
        order1_2.calculateTotal();

        Order order1_3 = new Order(customer1);
        order1_3.addItem(burger);
        order1_3.addItem(juice);
        order1_3.addItem(salad);
        order1_3.calculateTotal();

        Order order2_1 = new Order(customer2);
        order2_1.addItem(pasta);
        order2_1.addItem(tea);
        order2_1.calculateTotal();

        Order order2_2 = new Order(customer2);
        order2_2.addItem(sushi);
        order2_2.addItem(smoothie);
        order2_2.calculateTotal();

        Order order2_3 = new Order(customer2);
        order2_3.addItem(pizza);
        order2_3.addItem(cola);
        order2_3.addItem(salad);
        order2_3.calculateTotal();

        Order order3_1 = new Order(customer3);
        order3_1.addItem(burger);
        order3_1.addItem(cola);
        order3_1.calculateTotal();

        Order order3_2 = new Order(customer3);
        order3_2.addItem(steak);
        order3_2.addItem(coffee);
        order3_2.calculateTotal();

        Order order3_3 = new Order(customer3);
        order3_3.addItem(pasta);
        order3_3.addItem(juice);
        order3_3.calculateTotal();

        Order order4_1 = new Order(customer4);
        order4_1.addItem(sushi);
        order4_1.addItem(tea);
        order4_1.calculateTotal();

        Order order4_2 = new Order(customer4);
        order4_2.addItem(pizza);
        order4_2.addItem(smoothie);
        order4_2.calculateTotal();

        Order order4_3 = new Order(customer4);
        order4_3.addItem(steak);
        order4_3.addItem(coffee);
        order4_3.addItem(salad);
        order4_3.calculateTotal();

        Order order5_1 = new Order(customer5);
        order5_1.addItem(burger);
        order5_1.addItem(cola);
        order5_1.calculateTotal();

        Order order5_2 = new Order(customer5);
        order5_2.addItem(pasta);
        order5_2.addItem(juice);
        order5_2.calculateTotal();

        Order order5_3 = new Order(customer5);
        order5_3.addItem(sushi);
        order5_3.addItem(smoothie);
        order5_3.addItem(salad);
        order5_3.calculateTotal();

        Customer vafadartarin = customer1;
        if (customer2.getLoyaltyPoints() > vafadartarin.getLoyaltyPoints())
            vafadartarin = customer2;
        if (customer3.getLoyaltyPoints() > vafadartarin.getLoyaltyPoints())
            vafadartarin = customer3;
        if (customer4.getLoyaltyPoints() > vafadartarin.getLoyaltyPoints())
            vafadartarin = customer4;
        if (customer5.getLoyaltyPoints() > vafadartarin.getLoyaltyPoints())
            vafadartarin = customer5;

        System.out.println(ashpaz.getInfo());
        System.out.println(hesabdar.getInfo());
        System.out.println(garson.getInfo());

        System.out.println(customer1.getInfo());
        System.out.println(customer2.getInfo());
        System.out.println(customer3.getInfo());
        System.out.println(customer4.getInfo());
        System.out.println(customer5.getInfo());

        List<MenuItem> menuItems = List.of(pizza, pasta, burger, salad, steak, sushi, tea, coffee, cola, juice, smoothie);
        for (MenuItem item : menuItems) {
            System.out.println(item.getDetails());
        }

    }

}
