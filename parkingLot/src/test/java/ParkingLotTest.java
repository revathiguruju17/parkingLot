import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {
    @Test
    void shouldParkAVehicle(){
        Parkable parkable = new Parkable(){};
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(parkable);
        assertTrue(parkingLot.contains(parkable));
    }

    @Test
    void shouldUnParkAParkedVehicle(){
        Parkable parkable = new Parkable(){};
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(parkable);
        parkingLot.unPark(parkable);
        assertFalse(parkingLot.contains(parkable));
    }
}
