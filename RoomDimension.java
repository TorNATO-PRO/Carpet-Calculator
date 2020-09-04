/*
    RoomDimension -> performs carpet calculations
 */

public class RoomDimension {

    // immutable fields
    private final double length;
    private final double width;

    // class constructor
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // gets the area of the carpet
    public double getArea() {
        return this.length * this.width;
    }

    // returns carpet dimensions in String format
    public String toString() {
        return "The length of this carpet is: " + this.length
                + " feet\nThe width of this carpet is: " + this.width
                + " feet\nThe total area of the carpet is " + getArea() + " feet";
    }
}
