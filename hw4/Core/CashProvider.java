package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;


public class CashProvider {





   
    public CashProvider() {
        
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    

}
