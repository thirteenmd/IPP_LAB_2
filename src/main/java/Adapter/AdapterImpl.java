package Adapter;

public class AdapterImpl implements Adapter {
    RandomService mRandomService;


    public int randomNumber(String name, String model) {
        mRandomService = new RandomServiceImpl();

        return mRandomService.randomNumber(name.length() + model.length());
    }
}
