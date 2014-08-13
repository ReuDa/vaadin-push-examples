package de.codecentric.example.websocket;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;

import de.codecentric.example.server.LoggingVaadinServlet;

@WebServlet(value = "/websocket/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = WebsocketUI.class)
public class WebsocketServlet extends LoggingVaadinServlet {

    private static final long serialVersionUID = 1L;

}