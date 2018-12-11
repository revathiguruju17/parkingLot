class ParkableNotFoundException extends ParkingLotException {
    ParkableNotFoundException(){
        super("parkable not found");
    }
}
