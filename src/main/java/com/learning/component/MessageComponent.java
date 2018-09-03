package com.learning.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.service.MessageService;

@Component
public class MessageComponent {
private MessageService svc;
@Autowired
public MessageService setMessageService(MessageService svc)
{
	
	return this.svc=svc;
	
}

public Boolean processMessage(String recvr, String content)
{
	return this.svc.sendMessage(recvr, content);
}

}
