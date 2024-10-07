package creational.factoryMethod;

import creational.factoryMethod.factory.CarFactory;
import creational.factoryMethod.factory.MotorCycleFactory;
import creational.factoryMethod.factory.VehiculeFactory;
import creational.factoryMethod.product.Vehicule;

public class Main {
    public static void main(String[] args) {
        VehiculeFactory motorCycleFactory = new MotorCycleFactory();
        Vehicule motorCycle= motorCycleFactory.create();
        motorCycle.build();
        VehiculeFactory carFactory = new CarFactory();
        Vehicule car = carFactory.create();
        car.build();
    }
}
