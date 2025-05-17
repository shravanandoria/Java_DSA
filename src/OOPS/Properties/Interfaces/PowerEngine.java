package OOPS.Properties.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("PowerEngine start");
    }

    @Override
    public void stop(){
        System.out.println("Powerengine stop");
    }

    @Override
    public void acc(){
        System.out.println("Powerengine acc");
    }
}
