package de.codecentric.example.streaming;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;

import de.codecentric.example.common.LoggingVaadinServlet;

@WebServlet(value = "/streaming/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = StreamingUI.class)
public class StreamingServlet extends LoggingVaadinServlet {

    private static final long serialVersionUID = 1L;

}