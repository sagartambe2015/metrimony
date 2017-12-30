package metrimony.test.integration;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import metrimony.MetrimonyApplication;
import metrimony.backend.peristence.domain.backend.specific.ContactInfo;
import metrimony.backend.peristence.domain.backend.specific.MyInterestDetails;
import metrimony.backend.peristence.domain.backend.specific.PersonalDetails;
import metrimony.backend.peristence.domain.backend.specific.ProfessionDetails;
import metrimony.backend.peristence.domain.backend.specific.ReligionDetail;
import metrimony.backend.peristence.domain.backend.specific.UserProfile;
import metrimony.backend.peristence.repositories.UserProfileRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MetrimonyApplication.class)
public class UserRepositoryIntegrationTest extends AbstractIntegrationTest {

	@Autowired
	private UserProfileRepository userProfileRepository;

	private UserProfile createUserProfile() {

		UserProfile userProfile = new UserProfile();
		userProfile.setFirstName("Saagar");
		userProfile.setMiddleName("Sudhir");
		userProfile.setSurname("Tambe");
		userProfile.setBloodGroup("A+");
		userProfile.setGender("Male");
		userProfile.setDateOfBirth(new Date());
		userProfile.setReligion("Hindu");
		userProfile.setMontherTongue("Marathi");
		userProfile.setProfileFor("Test");

		setContactInfo(userProfile);
		setMyInterestDetails(userProfile);
		setPersonalDetails(userProfile);
		setProfessionalDetails(userProfile);
		setReligionDetails(userProfile);
		return userProfile;
	}

	private void setContactInfo(UserProfile userProfile) {
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setEmailId("tambe.sagar@gmail.com");
		contactInfo.setAddress("503-UttamPlaza Kharadi");
		contactInfo.setPrimaryMobileNo("9664446974");
		contactInfo.setAlternativeMobileNo("478787888");
		contactInfo.setPinCode("4000045");

		userProfile.setContactInfo(contactInfo);

	}

	private void setMyInterestDetails(UserProfile userProfile) {
		MyInterestDetails myInterestDetails = new MyInterestDetails();
		myInterestDetails.setUserId("1");
		myInterestDetails.setId("1");
		myInterestDetails.setName("I1");
		myInterestDetails.setValue("Cooking");
		myInterestDetails.setRefParentId("1");

		userProfile.setMyInterestDetails(myInterestDetails);

	}

	private void setPersonalDetails(UserProfile userProfile) {
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setLstMatitalStatus("Widowed");// Never Married,Widowed,Divorced,Awaiting to Divorce
		personalDetails.setHeight("7"); // Can be converted to inch to cm vice-verca in sub class
		personalDetails.setFamilyStatus("Middle class"); // Middle class, Upper middle class, Rich, Affluent
		personalDetails.setFamilyType("Joint"); // Joint, Nuclear
		personalDetails.setFamilyValues("Orthodox"); // Orthodox, Traditional, Moderate, Liberal
		personalDetails.setDisabilty("Normal"); // Normal, Physically challenged
		userProfile.setPersonalDetails(personalDetails);

	}

	private void setReligionDetails(UserProfile userProfile) {
		ReligionDetail religionDetail = new ReligionDetail();
		religionDetail.setCast("Kunabi");
		religionDetail.setSubcast("Kunabi");
		religionDetail.setGohtra("Brhaman");
		religionDetail.setDosh("Mangal");
		userProfile.setReligionDetails(religionDetail);

	}

	private void setProfessionalDetails(UserProfile userProfile) {
		ProfessionDetails professionDetails = new ProfessionDetails();
		professionDetails.setHighestEducation("PostGraduate");
		professionDetails.setEmployedIn("Government");// Government, Private ,Business, Defence ,Self, Employed ,Not
														// working
		professionDetails.setOccupation("BscIT");
		professionDetails.setIncome("100000");
		professionDetails.setAboutYourSelf("gsaggdsgdfsdg");
		userProfile.setProfessionDetails(professionDetails);

	}

	@Test
	public void insertUserProfile() {
		UserProfile userProfile = createUserProfile();
		userProfileRepository.save(userProfile);
	}

}
