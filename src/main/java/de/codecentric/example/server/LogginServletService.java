package de.codecentric.example.server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinResponse;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletService;
import com.vaadin.server.VaadinSession;

public class LogginServletService extends VaadinServletService {

    private final Log log = LogFactory.getLog(this.getClass());

    private static final long serialVersionUID = 1L;

    public LogginServletService(VaadinServlet servlet, DeploymentConfiguration deploymentConfiguration) throws ServiceException {
	super(servlet, deploymentConfiguration);
    }

    @Override
    public void requestStart(VaadinRequest request, VaadinResponse response) {
	log.debug("Request Start");
	super.requestStart(request, response);
    }

    @Override
    public void requestEnd(VaadinRequest request, VaadinResponse response, VaadinSession session) {
	super.requestEnd(request, response, session);
	log.debug("Request End");
    }

}
