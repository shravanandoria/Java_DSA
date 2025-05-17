package OOPS.Properties.Interfaces;

public class Main {

    public static void main(String[] args) {

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}
