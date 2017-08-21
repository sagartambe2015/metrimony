package devopsbuddy.web.domain.frontend;

import java.io.Serializable;

public class FeeedbackPojo implements Serializable{
	
	@Override
	public String toString() {
		return "FeeedbackPojo [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", feedback="
				+ feedback + "]";
	}
	private static final long serialVersionUID  = 1L;
	private String email;
	private String firstName;
	private String lastName;
	private String feedback;
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
