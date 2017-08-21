package devopsbuddy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import devopsbuddy.backend.service.EmailService;
import devopsbuddy.web.domain.frontend.FeeedbackPojo;


@Controller
public class ContactController {
	
	private static Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	private static final String FEEDBACK_MODEL_KEY = "feedback";
	
	private static final String CONTACT_US_VIEW_NAME  = "contact/contact";
	
	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactGet(ModelMap modelMap) {
		FeeedbackPojo feedBack = new FeeedbackPojo();
		modelMap.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedBack);
		return CONTACT_US_VIEW_NAME;
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeeedbackPojo feedback) {
		logger.info("Contact Us Feedback receivbed :{}",feedback);
		emailService.sendFeedbackEmail(feedback);
		return CONTACT_US_VIEW_NAME;
	}

}
