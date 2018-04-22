package org.example.demo.ticket.business.contract.manager;

import java.util.List;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

public interface TicketManager {

	int getCountTicket(RechercheTicket pRechercheTicket);

	List<Ticket> getListTicket(RechercheTicket pRechercheTicket);

	Ticket getTicket(Long pNumero) throws NotFoundException;

}
