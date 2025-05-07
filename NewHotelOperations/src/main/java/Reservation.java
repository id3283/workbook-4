import java.security.InvalidParameterException;

public class Reservation {

    String roomType;
    boolean weekend;

    double getPrice() {
        double price;
        if(this.roomType.equals("king")) {
            price = 139.0;
        }
        else if(this.roomType.equals("double")) {
            price = 124.00;
        }
        else {
            throw new RuntimeException("Invalid room type");
        }
        if (weekend) {
            return 1.10 * price;
        }
        return price;
    }

    public void setRoomType(String roomType) {
        if(!roomType.equals("king") && !roomType.equals("double")) {
            throw new InvalidParameterException("invalid room type (again)");
        }
        this.roomType = roomType;

    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
