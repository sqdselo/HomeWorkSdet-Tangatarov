package lection_1;

import lection_1.Entity.*;

import java.util.Random;

public class Setup {
    public static void main(String[] args){
        Random random = new Random();

        Car car = new Car();
        Tractor tractor = new Tractor(random.nextInt(10, 100));
        SportCar sportCar = new SportCar();
        Bus bus = new Bus();

        bus.SpeedTest(10.0);
        
    }
}
