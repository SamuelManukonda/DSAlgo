package LLD.parking_lot.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {

    private int spotNumber;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor;
    private ParkingStatus parkingStatus;
}
