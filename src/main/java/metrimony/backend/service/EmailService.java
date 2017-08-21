package metrimony.backend.service;

import org.springframework.mail.SimpleMailMessage;

import metrimony.web.domain.frontend.FeeedbackPojo;


public interface EmailService {
	
	public void sendFeedbackEmail(FeeedbackPojo feedBackPojo);
	
	public void sendGenericMail(SimpleMailMessage simpleMessage);
}
