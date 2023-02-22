package shapes;

public class Rectangle extends Quadrilateral {


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
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

