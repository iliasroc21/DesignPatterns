package creational.factoryMethod.product;

public class MotorCycle implements Vehicule{
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
