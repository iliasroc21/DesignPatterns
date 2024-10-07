package creational.abstractFactory;

import creational.abstractFactory.factory.Corporation;
import creational.abstractFactory.factory.FutureVehiculeCorporation;
import creational.abstractFactory.factory.NextGenCorporation;
import creational.abstractFactory.product.ElectricVehicule;
import creational.abstractFactory.product.MotorVehicule;

public class Main {
    public static void main(String[] args) {
        Corporation futureVehiculeCorporation = new FutureVehiculeCorporation();
        Corporation nextGenCorporation = new NextGenCorporation();
        MotorVehicule futureMotorVehicle = futureVehiculeCorporation.createMotorVehicule();
        MotorVehicule nextGenMotorVehicle = nextGenCorporation.createMotorVehicule();
        ElectricVehicule futureElectricVehicle = futureVehiculeCorporation.createElectricVehicule();
        ElectricVehicule nextGenElectricVehicle = nextGenCorporation.createElectricVehicule();

    }
}
