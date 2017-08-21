package devopsbuddy.backend.service;



import org.springframework.mail.SimpleMailMessage;

	
public class MockEmailService extends AbstractEmailService {

	@Override
	public void sendGenericMail(SimpleMailMessage simpleMessage) {
		System.out.println("Simulating Email Service");
		System.out.println(simpleMessage);
		System.out.println("Email Sent");
		
	}
	
	//private static final Loggger LOG = LoggerFactory.getLogger(MockEmailService.class);

	
	
}
