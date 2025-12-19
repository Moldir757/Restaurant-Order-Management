public class Order {
    private int orderId;
    private MenuItem item;
    private int quantity;

    // Constructor
    public Order(int orderId, MenuItem item, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public MenuItem getItem() {
        return item;
    }

    public void setItem(MenuItem item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method
    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println(
                "Order ID: " + orderId +
                        ", Item: " + item.getName() +
                        ", Quantity: " + quantity +
                        ", Total: $" + getTotalPrice()
        );
    }
}

