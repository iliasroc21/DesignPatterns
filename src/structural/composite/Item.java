package structural.composite;

public abstract class Item {
    protected String name;
    public Item(String name) {
        this.name = name;
    }

    public abstract int getPrice(); // Abstract method for price
    public abstract void showItemDetails(); // Abstract method to show details
}