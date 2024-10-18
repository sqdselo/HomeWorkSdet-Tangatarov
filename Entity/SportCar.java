package Entity;
import Interface.IVisual;
import java.awt.*;

public class SportCar extends Car implements IVisual {
    private final String material = "Железо";
    private static final int avgSpeed = 160;

    @Override
    public Color ColorCar() {
        return Color.RED;
    }

    @Override
    public int SpeedCar() {
        return 70;
    }

    @Override
    public double WeightCar() {
        return 800.3;
    }
    @Override
    public String Material(){
        return material;
    }

    public static int getAvgSpeed(){
        return avgSpeed;
    }
}
