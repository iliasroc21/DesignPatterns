package structural.composite;

public class Product extends Item{
    private int price;
    public Product(String name ,int price){
        super(name);
        this.price= price;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showItemDetails() {
        System.out.println(name + ": $" + price);
    }
}
