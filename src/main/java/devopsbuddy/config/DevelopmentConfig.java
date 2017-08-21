package devopsbuddy.config;


import java.sql.SQLException;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import devopsbuddy.backend.service.EmailService;
import devopsbuddy.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("application-dev.properties")
public class DevelopmentConfig {
	
	@Bean
	public EmailService emailService(){
		System.out.println("Creating EmailService");
		return new MockEmailService();
	}
	
	@Bean
	public ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new WebServlet());
		bean.addUrlMappings("/console/*");
		return bean;
	}
	
	@Bean(initMethod="start",destroyMethod="stop")
	 public org.h2.tools.Server h2WebConsonleServer () throws SQLException {
	   return org.h2.tools.Server.createWebServer("-web","-webAllowOthers","-webDaemon","-webPort", "8082");
	 }
	
}
