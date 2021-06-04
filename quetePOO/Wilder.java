package quetePOO;

public class Wilder {

	private String firstname;
	private boolean aware;

	/** Mon constructeur */

	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}

	/** Mes getteurs/setteurs */
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	/** la methode qui suis je */
	
	public String whoAmI() {
		if(isAware()) {
			return "Je m'appelle " + getFirstname() + " et je suis aware";
		}
		return "Je m'appelle " + getFirstname() + " et je suis pas aware";
	}
}