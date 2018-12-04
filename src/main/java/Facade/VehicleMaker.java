package Facade;

import Models.CarImpl;
import Models.MotoImpl;
import Models.Vehicle;

public class VehicleMaker {
    private Vehicle car;
    private Vehicle moto;

    public VehicleMaker(String name, String model) {
        this.car = new CarImpl(name,model);
        this.moto = new MotoImpl(name,model);
    }
    public void driveCar(){
        car.drive();
    }
    public void driveMoto(){
        moto.drive();
    }
}
