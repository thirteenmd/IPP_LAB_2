package Models;

public class CarImpl implements Car {
    private String name;
    private String model;

    public CarImpl(String name, String model) {
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
        System.out.println(toString() + " the car is driven");
    }
}
