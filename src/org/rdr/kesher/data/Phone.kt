package org.rdr.kesher.data

import org.rdr.kesher.data.Contact.ContactType

class Phone : Contact {
	var phone: String? = null

	constructor() {
	}

	constructor(contactType: ContactType?, phone: String?) {
		type = contactType
		this.phone = phone
	}
}