package devopsbuddy.web.i18n;

import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
/**
 * 
 * @author sagart
 *
 */
@Service
public class I18NService {
	
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(I18NService.class);
	
	@Autowired
	private MessageSource messageSource;
	
	public String getMessage(String messageId) {
		logger.trace("Getting message for {messageId}", messageId);
		Locale local = LocaleContextHolder.getLocale();
		return getMessage(messageId, local);
	}

	public String getMessage(String messageId, Locale local) {
		return messageSource.getMessage(messageId, null, local);		
	}

}
