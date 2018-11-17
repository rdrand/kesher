package org.rdr.kesher.data

/**
 * Represents a postal address, the fields are fairly obvious
 *
 * @author rache
 *
 */
class Address : Contact {
	var recipient: String? = null
	var line1: String? = null
	var line2: String? = null
	var city: String? = null
	var state: String? = null
	var zip: String? = null

	constructor() {
	}

	constructor(contactType: ContactType?, line1: String?, line2: String?, city: String?, state: String?, zip: String?) {
		this.type = contactType
		this.line1 = line1
		this.line2 = line2
		this.city = city
		this.state = state
		this.zip = zip
	}

	constructor(contactType: ContactType?, line1: String?, city: String?, state: String?, zip: String?) : this(contactType, line1, null, city, state, zip) {}

}