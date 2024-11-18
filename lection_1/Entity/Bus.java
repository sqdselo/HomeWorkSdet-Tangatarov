package lection_1.Entity;

import lection_1.Abstract.AbstractStyleCar;
import lection_1.Interface.ICar;

public class Bus extends AbstractStyleCar implements ICar {
    private final int countWheel = 8;
    private final String material = "Железный карказ, алюминиевое покрытие";

    public Bus() {
        IsTuning = true;
    }
    @Override
    public double SetMaxSpeed(int currentSpeed){
        return currentSpeed * 2;
    }

    @Override
    public void Volume() {
        System.out.println("Базовая громкость - " + 6);
    }

    @Override
    public int CountWheel() {
        return countWheel;
    }

    @Override
    public String Material() {
        return material;
    }
}
