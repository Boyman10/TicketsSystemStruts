package org.example.demo.ticket.business.contract.manager;

public interface ManagerFactory {

	TicketManager getTicketManager();

	ProjetManager getProjetManager();

	void setTicketManager(TicketManager ticketManager);

	void setProjetManager(ProjetManager projetManager);

}
