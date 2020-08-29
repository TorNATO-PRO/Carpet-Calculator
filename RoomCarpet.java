package nathan.waltz.dev;

public class RoomCarpet {

    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }

    public double getTotalCost() {
        return this.carpetCost * this.size.getArea();
    }

    public String toString() {
        
    }



}
