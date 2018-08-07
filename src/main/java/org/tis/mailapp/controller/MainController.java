package org.tis.mailapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tis.mailapp.service.EmailService;

@RestController
public class MainController {
	
	@Autowired
	public EmailService emailService;
	
	@RequestMapping("/mail")
	public String sendMail() {
		
		emailService.sendMessage();
		return "success";
	}

}
