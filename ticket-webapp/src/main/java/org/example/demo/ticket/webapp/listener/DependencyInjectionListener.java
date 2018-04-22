package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.demo.ticket.business.imple.manager.ManagerFactoryImple;
import org.example.demo.ticket.business.imple.manager.ProjetManagerImple;
import org.example.demo.ticket.business.imple.manager.TicketManagerImple;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

/**
 * @deprecated
 * @author hackme
 *
 */
public class DependencyInjectionListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

		ManagerFactoryImple vManagerFactory = new ManagerFactoryImple();
		vManagerFactory.setProjetManager(new ProjetManagerImple());
		vManagerFactory.setTicketManager(new TicketManagerImple());
		
		AbstractResource.setManagerFactory(vManagerFactory);
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
