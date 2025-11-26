package LLD.parking_lot.models;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot {
    private int parkingLotId;
    private List<Gate> gates;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private ParkingSpaceAllotmentStarategy parkingSpaceAllotmentStarategy;
    private BillingStrategy billingStrategy;
}
