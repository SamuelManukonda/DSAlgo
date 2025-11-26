package LLD.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum BillStatus {

    INITIATED,
    PAID,
    IN_PROGRESS,
    SUCCESS,
}
