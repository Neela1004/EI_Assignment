package creational.factory;

// Factory to create vehicle objects dynamically
public class VehicleFactory {
    public static Vehicle createVehicle(String type, String model) {
        if ("car".equalsIgnoreCase(type)) return new Car(model);
        if ("bike".equalsIgnoreCase(type)) return new Bike(model);
        System.out.println("Unknown vehicle type: " + type);
        return null;
    }
}
