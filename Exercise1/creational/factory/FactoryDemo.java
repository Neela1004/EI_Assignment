package creational.factory;

public class FactoryDemo {
    public static void run() {
        System.out.println("\n--- Factory Method Pattern Demo ---");

        Vehicle v1 = VehicleFactory.createVehicle("car", "Honda City");
        Vehicle v2 = VehicleFactory.createVehicle("bike", "Royal Enfield");

        if (v1 != null) v1.drive();
        if (v2 != null) v2.drive();
    }
}
