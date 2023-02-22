package shapes;

public class Square extends Quadrilateral {

    public Square(int length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public int setLength(int length) {
        return 0;
    }

    @Override
    public int setWidth(int width) {
        return 0;
    }
}
