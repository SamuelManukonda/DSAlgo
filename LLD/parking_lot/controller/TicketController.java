package LLD.parking_lot.controller;

import LLD.parking_lot.dtos.IssueTicketRequest;
import LLD.parking_lot.dtos.IssueTicketResponse;
import LLD.parking_lot.service.TicketService;

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    public IssueTicketResponse issueTicket(IssueTicketRequest issueTicketRequest) {

        ticketService.issueTicket(issueTicketRequest);
        return null;
    }
}