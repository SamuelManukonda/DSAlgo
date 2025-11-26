package LLD.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate {

    private int gateNumber;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;
}

