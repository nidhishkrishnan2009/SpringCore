package com.service.impl;

import com.learning.service.MessageService;

public class EmailService implements MessageService {

	@Override
	public Boolean sendMessage(String recvr, String content) {
		System.out.println("Email sent to "+recvr+" with text "+content);
		return true;
	}

}
