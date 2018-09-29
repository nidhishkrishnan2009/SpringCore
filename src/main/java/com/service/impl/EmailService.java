package com.service.impl;

import com.learning.service.MessageService;

public class EmailService implements MessageService {

	private String emailId;
	public EmailService(String emaildId) {
		this.emailId=emaildId;
	} 
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public Boolean sendMessage(String recvr, String content) {
		System.out.println("Email sent to "+recvr+" with text "+content);
		return true;
	}

}
