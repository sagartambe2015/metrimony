package devopsbuddy.backend.service;

import org.springframework.mail.SimpleMailMessage;

import devopsbuddy.web.domain.frontend.FeeedbackPojo;


public interface EmailService {
	
	public void sendFeedbackEmail(FeeedbackPojo feedBackPojo);
	
	public void sendGenericMail(SimpleMailMessage simpleMessage);
}
