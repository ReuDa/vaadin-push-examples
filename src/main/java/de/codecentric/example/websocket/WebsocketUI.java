package de.codecentric.example.websocket;

import com.vaadin.annotations.Push;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.shared.ui.ui.Transport;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Push(value = PushMode.AUTOMATIC, transport = Transport.WEBSOCKET)
public class WebsocketUI extends UI {

    private static final long serialVersionUID = 1L;

    @Override
    protected void init(VaadinRequest request) {
	final VerticalLayout content = new VerticalLayout();
	setContent(content);

	content.addComponent(new Label("Should use Websockets"));

	Button button = new Button("Click me");
	button.addClickListener(new ClickListener() {
	    private static final long serialVersionUID = 1L;

	    @Override
	    public void buttonClick(ClickEvent event) {
		content.addComponent(new Label("Hello World!"));
	    }
	});

	content.addComponent(button);
    }

}
