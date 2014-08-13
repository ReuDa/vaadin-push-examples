package de.codecentric.example.common;

import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletService;

public class LoggingVaadinServlet extends VaadinServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected VaadinServletService createServletService(DeploymentConfiguration deploymentConfiguration) throws ServiceException {
	LogginServletService service = new LogginServletService(this, deploymentConfiguration);
	service.init();
	return service;
    }

}
