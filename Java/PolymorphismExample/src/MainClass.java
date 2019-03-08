import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 5);
        Square s = new Square(2);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(r);
        rectangles.add(s);
        printAllAreas(rectangles);
        printAllShapes(rectangles);

        r = s;
        // System.out.println("Square has side length " + r.getSideLength());
       // System.out.println("Square has side length " + s.getSideLength());
    }

    private static void printAllAreas(List<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }
    }

    private static void printAllShapes(List<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
