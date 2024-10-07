package creational.factoryMethod.factory;

import creational.factoryMethod.product.MotorCycle;
import creational.factoryMethod.product.Vehicule;

public class MotorCycleFactory extends VehiculeFactory{
    @Override
    public Vehicule createMotorVehicule() {
        return new MotorCycle();
    }
}
