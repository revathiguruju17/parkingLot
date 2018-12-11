import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    private ParkingLot parkingLot;

    @Test
    void shouldParkAVehicle(){
        parkingLot = new ParkingLot(2);
        Parkable parkable = new Parkable(){};
        parkingLot.park(parkable);
        assertTrue(parkingLot.contains(parkable));
    }

    @Test
    void shouldUnParkAParkedVehicle(){
        parkingLot = new ParkingLot(2);
        Parkable parkable = new Parkable(){};
        parkingLot.park(parkable);
        parkingLot.unPark(parkable);
        assertFalse(parkingLot.contains(parkable));
    }

    @Test
    void shouldThrowAnExceptionWhenUnparkAVehicleThatIsNotParked(){
        parkingLot = new ParkingLot(2);
        Parkable parkable = new Parkable() {};
        assertThrows(ParkableNotFoundException.class, ()->
        parkingLot.unPark( parkable ));
    }

    @Test
    void shouldThrowAnExceptionWhenTheParkingLotIsFull(){
        parkingLot = new ParkingLot(2);
        Parkable parkable1 = new Parkable() {};
        Parkable parkable2 = new Parkable() {};
        Parkable parkable3 = new Parkable() {};
        parkingLot.park( parkable1 );
        parkingLot.park( parkable2 );
        assertThrows(ParkingLotFullException.class, ()-> parkingLot.park( parkable3 ));

    }
}
