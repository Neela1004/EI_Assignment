package structural.adapter;

public class AdapterDemo {
    public static void run() {
        System.out.println("\n--- Adapter Pattern Demo ---");

        Rectangle rect = new SquareAdapter(new Square(5));
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        rect.draw();
    }
}
