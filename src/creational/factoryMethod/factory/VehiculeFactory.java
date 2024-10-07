package creational.factoryMethod.factory;

import creational.factoryMethod.product.Vehicule;

public abstract class VehiculeFactory {
    public Vehicule create(){
        Vehicule vehicule = createMotorVehicule();
        return vehicule;
    }
    public abstract Vehicule createMotorVehicule();
}
