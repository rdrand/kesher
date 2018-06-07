package org.rdr.kesher.data;

/**
 * Each contact (e.g. Address) has a type that subdivides it's use. This class
 * is abstract and simply serves as a common base class. 
 * 
 * @author rache
 *
 */
public abstract class Contact {
	public enum ContactType {
		primary, // <<-- special value means this is the one to normally use
		
		home,
		office,
		mobile,
		main,
		
		home2,
		office2,
		mobile2,
		main2
	}
	private ContactType type;
	
	public ContactType getType() {
		return type;
	}
	public void setType(ContactType type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (type != other.type)
			return false;
		return true;
	}
}
