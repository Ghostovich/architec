package Core;

import Interfaces.ITicketRepo;
import Models.Ticket;
import Services.TicketRepository;

import java.util.List;


public class TicketProvider {

    public TicketProvider() {
        
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    

     

}
