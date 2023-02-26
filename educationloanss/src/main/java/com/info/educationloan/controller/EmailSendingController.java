package com.info.educationloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.educationloan.model.EmailSending;
import com.info.educationloan.service.EmailSendingService;



@CrossOrigin("http://localhost:4200/")
@RestController
public class EmailSendingController {
@Autowired
EmailSendingService es;

	@Value("${spring.mail.username}")
	private String fromEmail;

	@PostMapping(value="/emailSending")
	public String sendEmail(@RequestBody EmailSending e) {
		e.setFromEmail(fromEmail);
		return es.sendEmail(e);
	}
	
	
	@PostMapping(value = "/emailpdf")
	public String sendEmailwithAttachment(@RequestBody EmailSending e) {
		e.setFromEmail(fromEmail);
		

		return es.sendEmailwithAttachment(e);
	}

}
