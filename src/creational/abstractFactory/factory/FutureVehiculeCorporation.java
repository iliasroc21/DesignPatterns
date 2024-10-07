package creational.abstractFactory.factory;

import creational.abstractFactory.product.ElectricVehicule;
import creational.abstractFactory.product.FutureVehiculeElectricCar;
import creational.abstractFactory.product.FutureVehiculeMotorCycle;
import creational.abstractFactory.product.MotorVehicule;

public class FutureVehiculeCorporation extends  Corporation{
    @Override
    public MotorVehicule createMotorVehicule() {
        MotorVehicule vehicule = new FutureVehiculeMotorCycle();
        vehicule.build();
        return  vehicule;
    }

    @Override
    public ElectricVehicule createElectricVehicule() {
        ElectricVehicule vehicule =new FutureVehiculeElectricCar();
        vehicule.build();
        return vehicule;
    }
}
