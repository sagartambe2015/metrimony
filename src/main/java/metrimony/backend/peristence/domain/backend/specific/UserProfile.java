package metrimony.backend.peristence.domain.backend.specific;

import java.util.Date;

public class UserProfile {
	private String firstName;
	private String middleName;
	private String surname;
	private String bloodGroup;
	private String gender;
	private Date dateOfBirth;
	private String religion;
	private String montherTongue;
	private ContactInfo contactInfo;
	private String profileFor;
	private ReligionDetail religionDetails;
	private PersonalDetails personalDetails;
	private ProfessionDetails professionDetails;
	private MyInterestDetails myInterestDetails;

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getSurname() {
		return surname;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getReligion() {
		return religion;
	}

	public String getMontherTongue() {
		return montherTongue;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public String getProfileFor() {
		return profileFor;
	}

	public ReligionDetail getReligionDetails() {
		return religionDetails;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public ProfessionDetails getProfessionDetails() {
		return professionDetails;
	}

	public MyInterestDetails getMyInterestDetails() {
		return myInterestDetails;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setMontherTongue(String montherTongue) {
		this.montherTongue = montherTongue;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	public void setReligionDetails(ReligionDetail religionDetails) {
		this.religionDetails = religionDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public void setProfessionDetails(ProfessionDetails professionDetails) {
		this.professionDetails = professionDetails;
	}

	public void setMyInterestDetails(MyInterestDetails myInterestDetails) {
		this.myInterestDetails = myInterestDetails;
	}

}
