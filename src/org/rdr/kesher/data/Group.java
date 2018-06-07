package org.rdr.kesher.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A group can represent a few different things. All contact information, phone numbers, 
 * addresses and emails, are associated with a group. For each class of contact information 
 * only one can be considered the primary. The primary contact info for a type will be the one
 * used in any automatically generated report that does not override that setting or online 
 * display that shows summary information that does not explicity filter on some other value.
 * 
 * Note that a person can be associated with multiple groups.
 * 
 * A group such as a donor would contain the information for a single donor including 
 * the contact people and how to contact the donor. 
 * 
 * A group such as a membership would be associated with one or more people. At least 
 * one of the people would be associated with the group members. zero or more would be
 * associated with the group children.
 * 
 * A group such as grade# (where # is determined by the religious school) is associated with
 * kids in that grade.
 * 
 * @author rache
 *
 */
public class Group {
	private GroupType type;
	private String name;
	private List<Address> addresses = new ArrayList<>();
	private List<Phone> phones = new ArrayList<>();
	private List<Email> emails = new ArrayList<>();
	public GroupType getType() {
		return type;
	}
	public void setType(GroupType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result + ((emails == null) ? 0 : emails.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phones == null) ? 0 : phones.hashCode());
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
		Group other = (Group) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (emails == null) {
			if (other.emails != null)
				return false;
		} else if (!emails.equals(other.emails))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phones == null) {
			if (other.phones != null)
				return false;
		} else if (!phones.equals(other.phones))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Group [type=" + type + ", name=" + name + ", addresses=" + addresses
				+ ", phones=" + phones + ", emails=" + emails + "]";
	}
}

