package metrimony.backend.peristence.domain.backend.specific;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReligionDetail {

	@Id
	private int id;
	private String cast;
	private String subcast;
	private String gohtra;
	private String dosh;

	public String getCast() {
		return cast;
	}

	public String getSubcast() {
		return subcast;
	}

	public String getGohtra() {
		return gohtra;
	}

	public String getDosh() {
		return dosh;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public void setSubcast(String subcast) {
		this.subcast = subcast;
	}

	public void setGohtra(String gohtra) {
		this.gohtra = gohtra;
	}

	public void setDosh(String dosh) {
		this.dosh = dosh;
	}

}
