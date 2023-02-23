package shapes;

public class ShapesTest {

    public static void main(String[] args){

        Measurable myShape;
        Square mySquare = new Square(4);
        myShape = mySquare;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        Rectangle myRectangle = new Rectangle(4,5);
        myShape = myRectangle;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
    }
}
