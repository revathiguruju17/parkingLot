import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private final List<Parkable> parkables;

    ParkingLot() {
        this.parkables = new ArrayList<>();
    }

    void park(Parkable parkable) {
        parkables.add( parkable );
    }

    boolean contains(Parkable parkable) {
        return parkables.contains( parkable );
    }

    void unPark(Parkable parkable) throws ParkableNotFoundException {
        if (!contains( parkable )) {
            throw new ParkableNotFoundException();
        }
        parkables.remove( parkable );
    }
}
