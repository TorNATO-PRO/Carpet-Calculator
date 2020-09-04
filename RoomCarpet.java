/*
    RoomCarpet -> performs carpet calculations
 */

public class RoomCarpet {

    // immutable fields
    private final RoomDimension size;
    private final double carpetCost;

    // class constructor
    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
    }

    // total cost of the carpet
    public double getTotalCost() {
        return this.carpetCost * this.size.getArea();
    }

    // returns the cost per square footage and the cost of the whole carper
    // in String format
    public String toString() {
        return "The cost per square footage of this carpet is $"
                + String.format("%.2f", this.carpetCost) +
                "\nThe cost of the whole carpet is $"
                + String.format("%.2f", getTotalCost());
    }

}
