package creational.abstractFactory.product;

public class NextGenElectricCar implements  ElectricVehicule{
    @Override
    public void build() {
        System.out.println("NextGen Electric Car");
    }
}
