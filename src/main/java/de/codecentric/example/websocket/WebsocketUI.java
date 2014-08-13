package de.codecentric.example.websocket;

import com.vaadin.annotations.Push;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.shared.ui.ui.Transport;

import de.codecentric.example.common.PushUI;

@Push(value = PushMode.AUTOMATIC, transport = Transport.WEBSOCKET)
public class WebsocketUI extends PushUI {

    private static final long serialVersionUID = 1L;

}
