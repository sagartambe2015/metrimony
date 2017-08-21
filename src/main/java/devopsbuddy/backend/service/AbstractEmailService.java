package devopsbuddy.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import devopsbuddy.web.domain.frontend.FeeedbackPojo;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.to.address}")
	private String defaultToAddress;
	
	protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeeedbackPojo feedback){
		SimpleMailMessage message = new SimpleMailMessage();
		/*message.setTo(defaultToAddress);
		message.setFrom(feedback.getEmail());
		message.setSubject("[DevOps Buddy]:Feedback received from "+feedback.getFirstName());
		message.setText(feedback.getFeedback());*/
		return message;
	}
	
	@Override
	public void sendFeedbackEmail(FeeedbackPojo feeedbackPojo) {
		sendGenericMail(prepareSimpleMailMessageFromFeedbackPojo(feeedbackPojo));
	}
	
}
