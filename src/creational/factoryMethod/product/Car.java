package creational.factoryMethod.product;

public class Car implements Vehicule{
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
