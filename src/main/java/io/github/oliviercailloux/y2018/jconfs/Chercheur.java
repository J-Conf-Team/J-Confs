package io.github.oliviercailloux.y2018.jconfs;


import java.util.Objects;

/**
 * this class allows to stock a researcher
 *
 */


public class Chercheur {

	private String nom; 
	private String prenom;
	private String telephone;
	private String bureau;
	private String groupe; 
	private String mail;

	
	
	/**
	 * this is a getter which return a name
	 * @return nom
	 *   not <code>null</code>.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * this is a setter which allows to set the name
	 *   not <code>null</code>.
	 * @param nom
	 */
	public void setNom(String nom) {
	 this.nom=Objects.requireNonNull(nom);
	}
	
	/**
	 * @return prenom
	 *   not <code>null</code>.
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom
	 *   not <code>null</code>.
	 */
	public void setPrenom(String prenom) {
		 this.prenom=Objects.requireNonNull(prenom);
		}
/**
 * @return telephone
 *   not <code>null</code>.
 */
public String getTelephone() {
	return telephone; 
}

/**
 * @param telephone
 *   not <code>null</code>.
 */
public void setTelephone (String telephone) {
	this.telephone=Objects.requireNonNull(telephone); 
}


/**
 * @return bureau
 *   not <code>null</code>.
 */
public String getBureau() {
	return bureau; 
}


/**
 * @param bureau
 *   not <code>null</code>.
 */
public void setBureau(String bureau) {
	this.bureau=Objects.requireNonNull(bureau); 
}


/**
 * @return groupe
 *   not <code>null</code>.
 */
public String getGroupe() {
	return groupe; 
}


/**
 * @param groupe
 *   not <code>null</code>.
 */
public void setGroupe( String groupe ) {
	this.groupe =Objects.requireNonNull(groupe); 
}


/**
 * @return mail
 *   not <code>null</code>.
 */
public String getMail() {
	return mail; 
}

/**
 * @param mail
 *   not <code>null</code>.
 */
public void setmail( String mail ) {
	this.mail=Objects.requireNonNull(mail); 
}

/**
 * 
 * This is a constructor which initializes the chercheur object 
 * @param nom, prenom
 */
public Chercheur( String nom, String prenom) {
	this.nom =Objects.requireNonNull(nom);
	this.prenom =Objects.requireNonNull(prenom);
	this.telephone =new String("");
	this.bureau= "";
	this.mail = "";
	this.groupe="";
}

	
}
