package lection_1.Entity;
import lection_1.Interface.ICar;

public class Car implements ICar{
    @Override
    public void Volume(){
        System.out.println("Базовая громкость - " + 5);
    }
    @Override
    public int CountWheel(){
        return 4;
    }
    @Override
    public String Material(){
        return "Iron";
    }
}
