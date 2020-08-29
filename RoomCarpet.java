package nathan.waltz.dev;

public class RoomCarpet {

    private final RoomDimension size;
    private final double carpetCost;

    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
    }

    public double getTotalCost() {
        return this.carpetCost * this.size.getArea();
    }

    public String toString() {
        return "The cost per square footage of this carpet is $"
                + String.format("%.2f", this.carpetCost) +
                "\nThe cost of the whole carpet is $"
                + String.format("%.2f", getTotalCost());
    }

}
