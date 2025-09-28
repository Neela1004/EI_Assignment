package creational.factory;

public class Bike implements Vehicle {
    private final String model;

    public Bike(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Riding bike: " + model);
    }

    @Override
    public String getName() {
        return "Bike[" + model + "]";
    }
}
