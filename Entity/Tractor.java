package Entity;
import Interface.IVisual;
import java.awt.*;

public class Tractor extends Car implements IVisual{
    private int armour;
    private static final int avgSpeed = 100;
    public Tractor(int armour){
        this.armour = armour;
    }

    @Override
    public Color ColorCar(){
        return Color.DARK_GRAY;
    }
    @Override
    public int SpeedCar(){
        return 50;
    }
    @Override
    public double WeightCar(){
        return 1000.5;
    }
    public int GetArmour(){
        return armour;
    }

    public static int getAvgSpeed(){
        return avgSpeed;
    }
}
