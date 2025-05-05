public class Room {
    int numberOfBeds;
    double price;
    boolean dirty;
    boolean occupied;

    public boolean isAvailable() {
        if(!dirty && !occupied) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
