public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        System.out.println("Constructing a rectangle with width " + w + " and height " + h);
        width = w;
        height = h;
    }

    public int getArea() {
        System.out.println("Inside Rectangle's getArea");

        return width * height;
    }

    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
