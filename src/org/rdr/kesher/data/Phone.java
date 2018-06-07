package org.rdr.kesher.data;

import org.rdr.kesher.data.Contact.ContactType;

public class Phone extends Contact {
	private String phone;

	public Phone() {
		
	}
	
	public Phone(ContactType contactType, String phone) {
		setType(contactType);
		setPhone(phone);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		Phone other = (Phone) obj;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Phone [phone=" + phone + ", getType()=" + getType() + "]";
	}
	
	
}
