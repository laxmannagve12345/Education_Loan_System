package com.info.educationloan.serviceImpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.EmailSending;
import com.info.educationloan.service.EmailSendingService;

@Service
public class EmailSendingServiceImpl implements EmailSendingService{

	@Autowired
	JavaMailSender  javamailsender;
	@Override
	public String sendEmail(EmailSending e) {
		SimpleMailMessage mailmessage=new SimpleMailMessage();
		mailmessage.setTo(e.getToEmail());
		mailmessage.setFrom(e.getFromEmail());
		mailmessage.setSubject(e.getSubject());
		mailmessage.setText(e.getTextBody()+e.getEuserName()+e.getPassword());
		mailmessage.setBcc(e.getToBcc());
		try {
			
			javamailsender.send(mailmessage);
			return "email send successfully...............";
		}
		catch(Exception e2) {
			e2.printStackTrace();
			return "email can not be send";
		}
		
		
	}
	@Override
	public String sendEmailwithAttachment(EmailSending e) {
		  MimeMessage mimeMessage= javamailsender.createMimeMessage();

      	try {
				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
				helper.setTo(e.getToEmail());
				helper.setFrom(e.getFromEmail());
				helper.setSubject(e.getSubject());
				helper.setText(e.getTextBody()+" "+e.getEuserName()+" "+e.getPassword());
                 helper.setBcc(e.getToBcc());
                 
			FileSystemResource resource=new FileSystemResource("D:\\AngularRouting.pdf");
			
				helper.addAttachment(resource.getFilename(),resource);
				
				javamailsender.send(mimeMessage);
				return "email send successfully...";
				
			} catch (MessagingException e1) {
				
				e1.printStackTrace();
				return "email can not be sent";
			}
		
	}

	
	
	
	
	
//	
//	@Override
//	public String sendEmail(Employee e) {
//		SimpleMailMessage mailmessage=new SimpleMailMessage();
//		mailmessage.setTo(e.getToEmail());
//		mailmessage.setFrom(e.getFromEmail());
//		mailmessage.setSubject(e.getSubject());
//		mailmessage.setText(e.getTextBody()+e.getEuserName()+e.getPassword());
//		mailmessage.setBcc(e.getToBcc());
//		try {
//			
//			javamailsender.send(mailmessage);
//			return "email send successfully...............";
//		}
//		catch(Exception e2) {
//			e2.printStackTrace();
//			return "email can not be send";
//		}
//		
//	}
}
