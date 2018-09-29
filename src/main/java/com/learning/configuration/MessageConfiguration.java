package com.learning.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.service.MessageService;
import com.service.impl.EmailService;
import com.service.impl.SMSService;

@Configuration
@ComponentScan(value="com.learning.component")
public class MessageConfiguration {
//@Bean
//public MessageService setMessageService()
//{
//	
//	//return new EmailService();
//	return new SMSService("Airtel");	
//}

	
	@Bean
	public EmailService emailService()
	{
		return new EmailService("nidhish@gmail.com");
	}
	
	@Bean
	public SMSService smsService()
	{
		SMSService s=new SMSService();
		s.setSmsProvider("Idea");
		return s;
	}

}
