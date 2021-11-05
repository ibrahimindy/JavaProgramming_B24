package day54_abstraction.abstract_class;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Use card to start");
    }

    @Override
    public void charge() {
        System.out.println("plugged in ...charging");
    }
}
