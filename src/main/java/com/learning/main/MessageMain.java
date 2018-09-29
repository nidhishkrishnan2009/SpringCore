package com.learning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.component.MessageComponent;
import com.learning.configuration.MessageConfiguration;


public class MessageMain {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(MessageConfiguration.class);
	MessageComponent app=context.getBean(MessageComponent.class);
	//app.processMessage("nidhishkrishnan2009@gmail.com", "Hi Nidish");
	app.getEmail();
	app.getSMS();
}
}
