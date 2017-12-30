package metrimony.backend.peristence.domain.backend.specific;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalDetails {

	@Id
	private int id;
	private String lstMatitalStatus;// Never Married,Widowed,Divorced,Awaiting to Divorce
	private String height;// Can be converted to inch to cm vice-verca in sub class
	private String familyStatus;// Middle class, Upper middle class, Rich, Affluent
	private String familyType;// Joint, Nuclear
	private String familyValues;// Orthodox, Traditional, Moderate, Liberal
	private String disabilty;// Normal, Physically challenged

	public String getLstMatitalStatus() {
		return lstMatitalStatus;
	}

	public String getHeight() {
		return height;
	}

	public String getFamilyStatus() {
		return familyStatus;
	}

	public String getFamilyType() {
		return familyType;
	}

	public String getFamilyValues() {
		return familyValues;
	}

	public String getDisabilty() {
		return disabilty;
	}

	public void setLstMatitalStatus(String lstMatitalStatus) {
		this.lstMatitalStatus = lstMatitalStatus;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	public void setFamilyValues(String familyValues) {
		this.familyValues = familyValues;
	}

	public void setDisabilty(String disabilty) {
		this.disabilty = disabilty;
	}
}
