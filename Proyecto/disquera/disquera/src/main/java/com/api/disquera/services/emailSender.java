package com.api.disquera.services;

import com.api.disquera.infra.MailManager;
import org.springframework.stereotype.Service;

@Service
public class emailSender {
	MailManager mailManager;
	public emailSender(MailManager mailManager)
	{
		this.mailManager = mailManager;
	}
	public void sendMessageUser(String email , String message)
	{
		mailManager.sendMessage(email, message);
	}
}
