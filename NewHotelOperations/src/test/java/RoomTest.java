import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testX() {
        Room room = new Room(2, 100, false, false);
        room.checkIn();
        assertTrue(room.occupied);
        
    }

    @Test
    void testY() {
        Room room = new Room(2, 100, true, false);
        room.checkIn();
        assertFalse(room.occupied);
    }


    @Test
    void testCheckInToReadyRoom() {
//        Room room = new Room();
//        room.setDirty(false);
//        room.setOccupied(false);
//
//        boolean actual = room.checkIn();
//
//        assertTrue(actual);

    }

}