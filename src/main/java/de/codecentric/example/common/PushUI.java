package de.codecentric.example.common;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class PushUI extends UI {

    private static final long serialVersionUID = 1L;

    @Override
    protected void init(VaadinRequest request) {
	final VerticalLayout content = new VerticalLayout();
	setContent(content);

	Button button1 = new Button("Click me - Normal user interaction");
	button1.addClickListener(new ClickListener() {
	    private static final long serialVersionUID = 1L;

	    @Override
	    public void buttonClick(ClickEvent event) {
		content.addComponent(new Label("Hello World!"));
	    }
	});

	Button button2 = new Button("Click me - Server push in 2 seconds");
	button2.addClickListener(new ClickListener() {
	    private static final long serialVersionUID = 1L;

	    @Override
	    public void buttonClick(ClickEvent event) {
		new Thread() {
		    @Override
		    public void run() {
			try {
			    Thread.sleep(2000);
			    access(new Runnable() {
				@Override
				public void run() {
				    content.addComponent(new Label("Hello World! - Pushed from server"));
				}
			    });
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		    }
		}.start();
	    }
	});

	content.addComponent(button1);
	content.addComponent(button2);
    }

}
