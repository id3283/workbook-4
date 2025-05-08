public class Room {
    int numberOfBeds;
    double price;
    boolean dirty;
    boolean occupied;

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public Room(int numberOfBeds, double price, boolean dirty, boolean occupied) {

        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.occupied = occupied;
    }

    public Room() {
    }

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

    public void checkIn() {
        if (this.dirty || this.occupied) {
            // do nothing
        }
        else {
            this.occupied = true;
            this.dirty = true;
        }
    }
}
