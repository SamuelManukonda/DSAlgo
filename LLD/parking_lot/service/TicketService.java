package LLD.parking_lot.service;

import LLD.parking_lot.dtos.IssueTicketRequest;
import LLD.parking_lot.exception.GateNotFoundException;
import LLD.parking_lot.repository.GateRepository;

public class TicketService {

   private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public void issueTicket(IssueTicketRequest issueTicketRequest) {
        try {
            gateRepository.findByGateId(1);
        } catch (GateNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
