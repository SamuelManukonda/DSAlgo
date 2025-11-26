package LLD.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private VehicleType vehicleType;
}
