package structural.adapter;

// Adapter class to adapt Square to Rectangle
public class SquareAdapter implements Rectangle {
    private final Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public int getWidth() {
        return square.getSide();
    }

    @Override
    public int getHeight() {
        return square.getSide();
    }

    @Override
    public void draw() {
        square.drawSquare();
    }
}
