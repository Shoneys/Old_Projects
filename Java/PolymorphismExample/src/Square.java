public class Square extends Rectangle {
    private int sideLength;

    public Square(int side) {
        super(side, side);
        System.out.println("Constructing a square with side length " + side);
        sideLength = side;
    }

    public int getSideLength() {
        return sideLength;
    }
    public String toString() {
        return "Square with width sideLength: " + sideLength ;
    }
}
