import shapes.Circle;
import shapes.Rectangle;
//import shapes.Shape;
import shapes.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        double x = Math.floor(Math.random() * 99 + 1) / 100;

        Circle circle = new Circle(3.5);
        System.out.println("Circle's area before resize: "+ circle.getArea());
        circle.resize(x);
        System.out.println("Circle's radius has been increased by " + x * 100 + " %");
        System.out.println("Circle's area after resize: " + circle.getArea() + "\n");

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle's area before resize: " + rectangle.getArea());
        rectangle.resize(x);
        System.out.println("Rectangle's width and height have been increased by " + x * 100 + " %");
        System.out.println("Rectangle's area after resize: " + rectangle.getArea() + "\n");

        Square square = new Square(6);
        System.out.println("Square's area before resize: " + square.getArea());
        square.resize(x);
        System.out.println("Square's side has been increased by " + x * 100 + " %");
        System.out.println("Square's area after resize: " + square.getArea());

    }
}
