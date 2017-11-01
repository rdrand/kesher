package org.rdr.data;

/**
 * Each contact (e.g. Address) has a type that subdivides it's use. 
 * 
 * @author rache
 *
 */
public class Contact {
	enum ContactType {
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
	ContactType type;
}
