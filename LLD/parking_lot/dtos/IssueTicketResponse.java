package LLD.parking_lot.dtos;

import LLD.parking_lot.controller.TicketController;
import LLD.parking_lot.models.Ticket;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class IssueTicketResponse {

    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String message;
}
