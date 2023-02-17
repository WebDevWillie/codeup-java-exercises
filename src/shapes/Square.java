package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);

    }

    public int getArea() {
        int side = length;
        return side * side;
    }

    public int getPerimeter() {
       int side = length;
        return 4 * side;
    }
}
