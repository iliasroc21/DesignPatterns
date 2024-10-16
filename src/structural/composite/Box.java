package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends Item{
    private List<Item> items ;

    public Box(String name ) {
        super(name);
        items = new ArrayList<>();
    }
    public void addItem(Item item) {
        items.add(item); // Add item to the box
    }
    public void removeItem(Item item) {
        items.remove(item); // Remove item from the box
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice(); // Calculate total price of contained items
        }
        return totalPrice;
    }

    @Override
    public void showItemDetails() {
        System.out.println("Box: " + name + " contains:");
        for (Item item : items) {
            item.showItemDetails(); // Display details of items in the box
        }
    }
}
