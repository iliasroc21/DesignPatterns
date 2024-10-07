package creational.abstractFactory.product;

public class FutureVehiculeElectricCar implements ElectricVehicule{
    @Override
    public void build() {
        System.out.println("Future Vehicule Electric Car");
    }
}
