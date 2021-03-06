package io.github.oliviercailloux.y2018.jconfs;

import java.util.Objects;

/**
 * this class allows to stock a researcher
 *
 */

public class Researcher {

	private String surname;
	private String firstName;
	private String function;
	private String phone;
	private String office;
	private String group;
	private String mail;

	/**
	 * this is a getter which return a surname
	 * 
	 * @return nom not <code>null</code>.
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * this is a setter which allows to set the name not <code>null</code>.
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = Objects.requireNonNull(surname);
	}

	/**
	 * @return firstName not <code>null</code>.
	 */
	public String getFirstname() {
		return firstName;
	}

	/**
	 * @param fistName
	 *            not <code>null</code>.
	 */
	public void setFirstName(String firstName) {
		this.firstName = Objects.requireNonNull(firstName);
	}

	/**
	 * @return telephone not <code>null</code>.
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param telephone
	 *            not <code>null</code>.
	 */
	public void setPhone(String phone) {
		this.phone = Objects.requireNonNull(phone);
	}

	/**
	 * @return bureau not <code>null</code>.
	 */
	public String getOffice() {
		return office;
	}

	/**
	 * @param bureau
	 *            not <code>null</code>.
	 */
	public void setOffice(String office) {
		this.office = Objects.requireNonNull(office);
	}

	/**
	 * @return groupe not <code>enull</code>.
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @param groupe
	 *            not <code>null</code>.
	 */
	public void setGroup(String group) {
		this.group = Objects.requireNonNull(group);
	}

	/**
	 * @return mail not <code>null</code>.
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            not <code>null</code>.
	 */
	public void setMail(String mail) {
		this.mail = Objects.requireNonNull(mail);
	}

	/**
	 * 
	 * @param fonctioon
	 *            not<code>null</code>.
	 */
	public void setFunction(String function) {
		this.function = Objects.requireNonNull(function);
	}

	/**
	 * 
	 * This is a constructor which initializes the chercheur object
	 * 
	 * @param nom,
	 *            not <code>null</code>.
	 * @param prenom
	 *            not <code>null</code>.
	 */
	public Researcher(String surname, String firstName) {
		this.surname = Objects.requireNonNull(surname);
		this.firstName = Objects.requireNonNull(firstName);
		this.function = "";
		this.phone = "";
		this.office = "";
		this.mail = "";
		this.group = "";
	}

	@Override
	public String toString() {
		return "nom: " + this.surname + " prenom: " + this.firstName + " fonction: " + this.function + " telephone: "
				+ this.phone + " bureau: " + this.office + " mail: " + mail + " groupe: " + this.group;

	}
}
