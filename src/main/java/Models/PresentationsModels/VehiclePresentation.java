package Models.PresentationsModels;

import Bridge.Presentator;
import Models.Vehicle;

public abstract class VehiclePresentation implements Vehicle {
    protected Presentator mPresentator;

    protected VehiclePresentation(Presentator presentator) {
        mPresentator = presentator;
    }

    public abstract void drive();
}
