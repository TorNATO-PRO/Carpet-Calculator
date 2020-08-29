package nathan.waltz.dev;

public class RoomDimension {

    private final double length;
    private final double width;

    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public String toString() {
        return "The length of this carpet is: " + this.length
                + " feet\nThe width of this carpet is: " + this.width
                + " feet\nThe total area of the carpet is " + getArea() + " feet";
    }
}
