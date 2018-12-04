package Models.PresentationsModels;

import Bridge.Presentator;
import Models.Vehicle;

public class VehiclePresentationImpl extends VehiclePresentation {
    private String name;
    private String model;

    public VehiclePresentationImpl(String name, String model, Presentator presentator) {
        super(presentator);
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "VehiclePresentationImpl{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


    public void drive() {
            mPresentator.present();
            System.out.println(this.toString());
    }
}
