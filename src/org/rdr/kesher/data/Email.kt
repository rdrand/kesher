package org.rdr.kesher.data

import org.rdr.kesher.data.Contact.ContactType

/**
 * Represents an email. At least for now the email will remain intact. For now the class will
 * not validate the email string.
 *
 * @author rache
 */
class Email : Contact {
	var email: String? = null

	constructor() {
	}

	constructor(contactType: ContactType?, email: String?) {
		this.type = contactType
		this.email = email
	}
}