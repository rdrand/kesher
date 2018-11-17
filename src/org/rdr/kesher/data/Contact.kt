package org.rdr.kesher.data

/**
 * Each contact (e.g. Address) has a type that subdivides it's use. This class
 * is abstract and simply serves as a common base class.
 *
 * @author rache
 *
 */
abstract class Contact {
	var type: ContactType? = null

	enum class ContactType {
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
}