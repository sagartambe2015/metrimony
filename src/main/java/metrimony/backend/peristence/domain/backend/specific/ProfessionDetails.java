package metrimony.backend.peristence.domain.backend.specific;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProfessionDetails {

	@Id
	private int id;
	private String highestEducation;
	private String employedIn;// Government, Private ,Business, Defence ,Self, Employed ,Not working
	private String occupation;
	private String income;
	private String aboutYourSelf;

	public String getHighestEducation() {
		return highestEducation;
	}

	public String getEmployedIn() {
		return employedIn;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getIncome() {
		return income;
	}

	public String getAboutYourSelf() {
		return aboutYourSelf;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public void setEmployedIn(String employedIn) {
		this.employedIn = employedIn;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public void setAboutYourSelf(String aboutYourSelf) {
		this.aboutYourSelf = aboutYourSelf;
	}
}
