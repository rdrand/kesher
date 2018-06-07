package org.rdr.kesher.data;

import org.rdr.kesher.data.Contact.ContactType;

/**
 * Represents an email. At least for now the email will remain intact. For now the class will 
 * not validate the email string.
 * 
 * @author rache
 */
public class Email extends Contact {
	private String email;

	public Email() {
		
	}
	
	public Email(ContactType contactType, String email) {
		setType(contactType);
		setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + ", getType()=" + getType() + "]";
	}
}
