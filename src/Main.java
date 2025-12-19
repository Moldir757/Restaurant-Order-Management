public class Main {
    public static void main(String[] args) {

        // Create Menu Items
        MenuItem pizza = new MenuItem("Pizza", 8.99);
        MenuItem burger = new MenuItem("Burger", 5.49);

        // Create Orders
        Order order1 = new Order(1, pizza, 2);
        Order order2 = new Order(2, burger, 3);

        // Create Restaurant
        Restaurant restaurant = new Restaurant("Food Palace");

        // Output to console
        restaurant.displayRestaurant();
        pizza.displayItem();
        burger.displayItem();
        order1.displayOrder();
        order2.displayOrder();

        // Compare orders
        if (order1.getTotalPrice() > order2.getTotalPrice()) {
            System.out.println("Order 1 is more expensive than Order 2.");
        } else if (order1.getTotalPrice() < order2.getTotalPrice()) {
            System.out.println("Order 2 is more expensive than Order 1.");
        } else {
            System.out.println("Both orders cost the same.");
        }
    }
}
