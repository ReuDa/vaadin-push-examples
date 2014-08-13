package de.codecentric.example.nopush;

import com.vaadin.annotations.Push;
import com.vaadin.shared.communication.PushMode;

import de.codecentric.example.common.PushUI;

@Push(value = PushMode.DISABLED)
public class NoPushUI extends PushUI {

    private static final long serialVersionUID = 1L;

}