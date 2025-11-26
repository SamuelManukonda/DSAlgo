package LLD.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Payment {

    private PaymentMode paymentMode;
    private float amount;
    private LocalDateTime paymentTime;
    private int referenceNumber;
    private PaymentStatus paymentStatus;
}
