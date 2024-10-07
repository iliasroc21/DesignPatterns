package creational.factoryMethod.factory;

import creational.factoryMethod.product.Car;
import creational.factoryMethod.product.Vehicule;

public class CarFactory extends VehiculeFactory{
    @Override
    public Vehicule createMotorVehicule() {
        return new Car();
    }
}
