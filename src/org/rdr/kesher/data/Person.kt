package org.rdr.kesher.data

import java.util.Date

data class Person constructor(first: String, middle: String, last: String) {
	/**
	 * id - each person is assigned an alphanumeric id. There are a few candidates.
	 * One is to use an assigned number, but as this id needs to match up in a mongo
	 * database and there's no referential integrity control, this seems less than
	 * idea. Email would work for modern people. For older or deceased people
	 * first-last-birthyear would likely work well (and could work for modern people
	 * as well). While rdms design avoids natural keys like this, for a small
	 * database, especially one that needs to be joined from external data, it seems
	 * ideal.
	 */
	var personId: Long? = null
		set(personId) {
			field = this.personId
		}
	var first: String? = null
	var middle: String? = null
	var last: String? = null
	var hebrew: String? = null
	var groups: List<Group>? = null
	var birthdate: Date? = null
	var deathdate: Date? = null
	val hebrewYahrzeit: Boolean? = null
	var gender: Gender? = null
	var parents: List<Person>? = null // If known and in members
	private val emails: List<Email>? = null
	private val addresses: List<Address>? = null
	private val phones: List<Phone>? = null

	enum class Gender {
		male, female
	}

	/**
	 * Is person in a particular group already? Uses existing set in groups because
	 * that is the only record of this information.
	 */
	fun in_group(group: Group?): Boolean {
		return this.groups!!.contains(group)
	}

	fun add_group(group: Group?) {
		this.groups!!.plus(group)
	}
	
	fun add_email(email: Email) {
		emails!!.plus(email);
	}
	
	public fun add_address(address: Address) {
		addresses!!.plus(address);
	}
	
	fun add_phone(phone: Phone) {
		phones!!.plus(phone);
	}
}