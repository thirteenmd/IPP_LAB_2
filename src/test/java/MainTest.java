import Adapter.ClientService;
import Bridge.PresentatorCar;
import Bridge.PresentatorMoto;
import Composite.CarConcurentsObj;
import Decorator.ComfortDecorator;
import Decorator.SportDecorator;
import Facade.VehicleMaker;
import Models.CarImpl;
import Models.MotoImpl;
import Models.PresentationsModels.VehiclePresentation;
import Models.PresentationsModels.VehiclePresentationImpl;
import Models.Vehicle;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void checkBridge() {
        VehiclePresentation vehicle = new VehiclePresentationImpl("BMW", "X6", new PresentatorCar());
        VehiclePresentation vehicle2 = new VehiclePresentationImpl("Mercedes", "E", new PresentatorMoto());

        vehicle.drive();
        vehicle2.drive();
    }

    @Test
    void checkAdapter() {
        ClientService clientService = new ClientService();
        System.out.println(clientService.getRandByVehicle(new VehiclePresentationImpl("BMW", "X6", new PresentatorCar())));
    }

    @Test
    void checkDecorat() {
        Vehicle vehicle = new CarImpl("Toyota","Prius");
        vehicle.drive();

        Vehicle sportCar = new SportDecorator(new CarImpl("BMW","M6"));
        sportCar.drive();

        Vehicle sportMoto = new ComfortDecorator(new MotoImpl("Mercedes","S-class"));
        sportMoto.drive();

    }

    @Test
    void checkComposite() {
        CarConcurentsObj carConcurents = new CarConcurentsObj("BMW", "3");
        carConcurents.addVehicle(new CarImpl("Mercedes", "C"));
        carConcurents.addVehicle(new CarImpl("Audi", "a4"));

        System.out.println(carConcurents.toString());
    }

    @Test
    void checkFacade() {
        VehicleMaker vehicleMaker = new VehicleMaker("New Brand", "New Model");
        vehicleMaker.driveCar();
        vehicleMaker.driveMoto();
    }
}