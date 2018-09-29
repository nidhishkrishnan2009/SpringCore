package com.service.impl;

import com.learning.service.MessageService;

public class SMSService implements MessageService {

	private String smsProvider;
//	public SMSService(String smsProvider)
//	{
//		this.smsProvider=smsProvider;
//	}
	public String getSmsProvider() {
		return smsProvider;
	}
	public void setSmsProvider(String smsProvider) {
		this.smsProvider = smsProvider;
	}
	@Override
	public Boolean sendMessage(String recvr, String content) {
		System.out.println("SMS sent to "+recvr+" with text "+content);
		return true;
	}

}
