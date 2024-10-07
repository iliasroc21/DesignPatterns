package creational.abstractFactory.factory;

import creational.abstractFactory.product.ElectricVehicule;
import creational.abstractFactory.product.MotorVehicule;
import creational.abstractFactory.product.NextGenElectricCar;
import creational.abstractFactory.product.NextGenMotorCycle;
import creational.factoryMethod.product.Vehicule;

public class NextGenCorporation extends Corporation{
    @Override
    public MotorVehicule createMotorVehicule() {
        MotorVehicule vehicule = new NextGenMotorCycle();
        vehicule.build();
        return vehicule;
    }

    @Override
    public ElectricVehicule createElectricVehicule() {
        ElectricVehicule vehicule  = new NextGenElectricCar();
        vehicule.build();
        return vehicule;
    }
}
