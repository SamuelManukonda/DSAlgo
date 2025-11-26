package LLD.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Bill {
    private Ticket ticket;
    private LocalDateTime exitTime;
    private float amount;
    private BillStatus billStatus;
    private Gate exitGate;
    private List<Payment> payments;
    private Operator operator;

    private BillingStrategy billingStrategy;

}
