package FactoryMethod;

public class CarJeep implements Car {
    @Override
    public void drive() {
        System.out.println("Started at 100km/h at 20 sec");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 5sec");
    }
}
