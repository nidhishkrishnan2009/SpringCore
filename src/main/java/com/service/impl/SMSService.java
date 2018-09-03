package com.service.impl;

import com.learning.service.MessageService;

public class SMSService implements MessageService {

	@Override
	public Boolean sendMessage(String recvr, String content) {
		System.out.println("SMS sent to "+recvr+" with text "+content);
		return true;
	}

}
