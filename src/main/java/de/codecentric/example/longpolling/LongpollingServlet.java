package de.codecentric.example.longpolling;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;

import de.codecentric.example.server.LoggingVaadinServlet;

@WebServlet(value = { "/longpolling/*", "/VAADIN/*" }, asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = LongpollingUI.class)
public class LongpollingServlet extends LoggingVaadinServlet {

    private static final long serialVersionUID = 1L;

}