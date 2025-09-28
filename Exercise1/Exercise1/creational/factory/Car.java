package creational.factory;

public class Car implements Vehicle {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving car: " + model);
    }

    @Override
    public String getName() {
        return "Car[" + model + "]";
    }
}
