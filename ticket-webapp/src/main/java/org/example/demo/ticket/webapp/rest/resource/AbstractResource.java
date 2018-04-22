package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;

public abstract class AbstractResource {

	private static ManagerFactory managerFactory;

	public static ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractResource.managerFactory = managerFactory;
	}
}
