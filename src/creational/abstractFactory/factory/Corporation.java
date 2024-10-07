package creational.abstractFactory.factory;

import creational.abstractFactory.product.ElectricVehicule;
import creational.abstractFactory.product.MotorVehicule;

public abstract class Corporation {
    public abstract MotorVehicule createMotorVehicule();
    public abstract ElectricVehicule createElectricVehicule();
}
