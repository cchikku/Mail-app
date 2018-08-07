package org.tis.mailapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailService {

	@Autowired
	public JavaMailSender javaMailSender;
	
	public void sendMessage() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("chikku.lal@yahoo.com");
        message.setTo("chicku.al7@gmail.com"); 
        message.setSubject("Test"); 
        message.setText("This is for testing purpose");
        javaMailSender.send(message);
	}
}
