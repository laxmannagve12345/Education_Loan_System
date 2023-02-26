package com.info.educationloan.service;

import com.info.educationloan.model.EmailSending;

public interface EmailSendingService {

	String sendEmail(EmailSending e);

	String sendEmailwithAttachment(EmailSending e);

}
