package de.codecentric.example.nopush;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;

import de.codecentric.example.common.LoggingVaadinServlet;

@WebServlet(value = "/nopush/*", asyncSupported = false)
@VaadinServletConfiguration(productionMode = false, ui = NoPushUI.class)
public class NoPushServlet extends LoggingVaadinServlet {

    private static final long serialVersionUID = 1L;

}