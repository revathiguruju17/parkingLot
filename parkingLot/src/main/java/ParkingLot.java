import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private final List<Parkable> parkables;
    private final int NUMBER_OF_SLOTS;

    ParkingLot(final int NUMBER_OF_SLOTS) {
        this.parkables = new ArrayList<>();
        this.NUMBER_OF_SLOTS = NUMBER_OF_SLOTS;
    }

    void park(Parkable parkable) throws ParkingLotFullException{
        if(isParkingLotFull()){
            throw new ParkingLotFullException();
        }
        parkables.add( parkable );
    }

    boolean contains(Parkable parkable)  {
        return parkables.contains( parkable );
    }

    private boolean isParkingLotFull() {
        return parkables.size()==NUMBER_OF_SLOTS;
    }

    void unPark(Parkable parkable) throws ParkableNotFoundException {
        if (!contains( parkable )) {
            throw new ParkableNotFoundException();
        }
        parkables.remove( parkable );
    }
}
