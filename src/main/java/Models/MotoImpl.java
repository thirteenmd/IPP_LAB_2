package Models;

public class MotoImpl implements Moto {
    private String name;
    private String model;

    public MotoImpl(String name, String model) {
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
        return "MotoImpl{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void drive() {
        System.out.println(toString() + " the moto is driven");
    }
}
