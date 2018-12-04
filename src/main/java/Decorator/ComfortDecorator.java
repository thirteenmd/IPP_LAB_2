package Decorator;

import Models.Vehicle;

public class ComfortDecorator extends VehicleDecorator {
    public ComfortDecorator(Vehicle decoratorVehicle) {
        super(decoratorVehicle);
    }

    @Override
    public void drive() {
        super.drive();
        setComfortSuspension();

    }
    private void setComfortSuspension(){
        System.out.println("Suspension is comfort");
    }
}
