package Adapter;

import Models.PresentationsModels.VehiclePresentationImpl;

public class ClientService {

    public int getRandByVehicle(VehiclePresentationImpl vehicleClass){

        Adapter adapter = new AdapterImpl();

        return adapter.randomNumber(vehicleClass.getName(), vehicleClass.getModel());
    }
}
