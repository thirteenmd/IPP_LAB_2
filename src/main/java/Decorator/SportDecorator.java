package Decorator;

import Models.Vehicle;

public class SportDecorator extends VehicleDecorator {
    public SportDecorator(Vehicle decoratorVehicle) {
        super(decoratorVehicle);
    }

    @Override
    public void drive() {
        super.drive();
        setSportSuspension();
    }
    private void setSportSuspension( ){
        System.out.println("Suspension is sport");
    }
}
