package metrimony.backend.peristence.domain.backend.specific;

public class ContactInfo {
	private String emailId;
	private String Address;
	private String primaryMobileNo;
	private String alternativeMobileNo;
	private String pinCode;

	public String getEmailId() {
		return emailId;
	}

	public String getAddress() {
		return Address;
	}

	public String getPrimaryMobileNo() {
		return primaryMobileNo;
	}

	public String getAlternativeMobileNo() {
		return alternativeMobileNo;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setPrimaryMobileNo(String primaryMobileNo) {
		this.primaryMobileNo = primaryMobileNo;
	}

	public void setAlternativeMobileNo(String alternativeMobileNo) {
		this.alternativeMobileNo = alternativeMobileNo;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}
