package structural.adapter;

// Adaptee class
public class Square {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void drawSquare() {
        System.out.println("Drawing square with side: " + side);
    }
}
