package Adapter;

import java.util.Random;

public class RandomServiceImpl implements RandomService {
    public int randomNumber(int maxValue) {
        Random rand = new Random();
        return rand.nextInt(maxValue) + 1;
    }
}
