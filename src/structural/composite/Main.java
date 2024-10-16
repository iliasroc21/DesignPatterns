package structural.composite;

public class Main {
    public static void main(String[] args) {
        Item phone = new Product("Smartphone", 800);
        Item laptop = new Product("Laptop", 1200);
        Item charger = new Product("Charger", 50);
        Item headphones = new Product("Headphones", 150);

        // Create a box and add products to it
        Box smallBox = new Box("Small Box");
        smallBox.addItem(phone);
        smallBox.addItem(charger);

        // Create a larger box and add smaller boxes and more products
        Box bigBox = new Box("Big Box");
        bigBox.addItem(smallBox);  // Add small box to big box
        bigBox.addItem(laptop);
        bigBox.addItem(headphones);

        // Display details of items in the big box
        System.out.println("Items in Big Box:");
        bigBox.showItemDetails();

        // Calculate total price of all items in the big box
        int totalPrice = bigBox.getPrice();
        System.out.println("\nTotal price of all items: $" + totalPrice);
    }
}
