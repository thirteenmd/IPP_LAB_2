package Composite;

import Models.Car;
import Models.CarImpl;
import Models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarConcurentsObj extends CarImpl {
    private List<Car> mCars;
    public CarConcurentsObj(String name, String model) {
        super(name, model);
        mCars = new ArrayList<Car>();
    }

    public List<Car> getCars() {
        return mCars;
    }

    public void addVehicle(Car car){
        mCars.add(car);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarConcurentsObj{" +
                "mCars=" + mCars +
                '}';
    }
}
