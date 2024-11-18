package lection_1.Abstract;

public class AbstractStyleCar {
    public static boolean IsTuning;
    private static String sound = "Врум-Врум";
    public double SetMaxSpeed(int currentSpeed){
        return currentSpeed * 1.5;
    }
    public void Sound(){
        System.out.println(sound);
    }
    //Изменение скорости в течении минуты
    public void SpeedTest(double startSpeed){
        for(double i = startSpeed; i < startSpeed + 100; i++){
            System.out.print(" " + i);
        }
    }
}
