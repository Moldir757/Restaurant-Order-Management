public class Restaurant {
    private String name;

    // Constructor
    public Restaurant(String name) {
        this.name = name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void displayRestaurant() {
        System.out.println("Restaurant Name: " + name);
    }
}
