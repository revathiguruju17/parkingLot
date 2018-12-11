import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    private ParkingLot parkingLot;
    @BeforeEach
    void setUp() {
        parkingLot = new ParkingLot();
    }

    @Test
    void shouldParkAVehicle(){
        Parkable parkable = new Parkable(){};
        parkingLot.park(parkable);
        assertTrue(parkingLot.contains(parkable));
    }

    @Test
    void shouldUnParkAParkedVehicle(){
        Parkable parkable = new Parkable(){};
        parkingLot.park(parkable);
        parkingLot.unPark(parkable);
        assertFalse(parkingLot.contains(parkable));
    }

    @Test
    void shouldThrowAnExceptionWhenUnparkAVehicleThatIsNotParked(){
        Parkable parkable = new Parkable() {};
        assertThrows(ParkableNotFoundException.class, ()->
        parkingLot.unPark( parkable ));
    }

}
