package devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource rrbm = new ReloadableResourceBundleMessageSource();
		rrbm.setBasename("classpath:i18n/messages");
		rrbm.setCacheSeconds(1800);
		return rrbm;
		
	}
}
