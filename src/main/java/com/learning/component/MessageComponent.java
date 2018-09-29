package com.learning.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.service.MessageService;
import com.service.impl.EmailService;
import com.service.impl.SMSService;

@Component
public class MessageComponent {
private MessageService svc;
private EmailService emailSvc;
private SMSService smsSvc;
//@Autowired
//public MessageService setMessageService(MessageService svc)
//{
//	
//	return this.svc=svc;
//	
//}

//@Autowired
//public MessageComponent(MessageService svc)
//{
//	this.svc=svc;
//}

@Autowired
public void setEmailService(EmailService emailSvc)
{
	this.emailSvc=emailSvc;
}

@Autowired
public void setSMSService(SMSService smsSvc)
{
	this.smsSvc=smsSvc;
}

public Boolean processMessage(String recvr, String content)
{
	return this.svc.sendMessage(recvr, content);
}

public void getEmail()
{
	if(emailSvc!=null)
		System.out.println("EmailId is -->"+emailSvc.getEmailId());
}

public void getSMS()
{
	if(smsSvc!=null)
		System.out.println("SMS is -->"+smsSvc.getSmsProvider());
}

}
