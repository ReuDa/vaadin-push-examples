package de.codecentric.example.longpolling;

import com.vaadin.annotations.Push;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.shared.ui.ui.Transport;

import de.codecentric.example.common.PushUI;

@Push(value = PushMode.AUTOMATIC, transport = Transport.LONG_POLLING)
public class LongpollingUI extends PushUI {

    private static final long serialVersionUID = 1L;

}
