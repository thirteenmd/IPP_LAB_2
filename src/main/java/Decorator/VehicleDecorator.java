package Decorator;

import Models.Vehicle;

public abstract class VehicleDecorator implements Vehicle{
    protected Vehicle decoratorVehicle;

    public VehicleDecorator(Vehicle decoratorVehicle) {
        this.decoratorVehicle = decoratorVehicle;
    }

    public void drive() {
        decoratorVehicle.drive();
    }
}
