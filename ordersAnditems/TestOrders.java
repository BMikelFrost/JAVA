import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        //Menu items, mocha, latte, drip coffee, capucciono
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.00;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.00;

        Item item4 = new Item();
        item4.name = "capucciono";
        item4.price = 5.00;
    
        // Order variables -- order1, order2 order3, order4
        Order order1 = new Order();
        System.out.println(order1.total);
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
    
//add item1 to order2 item list  
    order2.items.add(item1);
    order2.total += item1.price;

// order3 ordered a capuccino
order3.items.add(item4);
order3.total += item4.price;

// order4 aadded a latte
order4.items.add(item2);
order4.total += item2.price;

// Update Cindhuri’s status, 
order1.ready = true;
order2.ready = true;
// Sam ordered two more lattes 
order4.items.add(item2);
order4.items.add(item2);
order4.total += item2.price * 2;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
