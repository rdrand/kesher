package org.rdr.data;

import java.util.Date;
import java.util.List;

enum Gender {
	male, female
};

public class Person {
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
	String person_id;
	String first;
	String middle;
	String last;
	String hebrew;
	List<Integer> groups;
	Date birthdate;
	Date deathdate;
	Boolean hebrew_yahrzeit;
	Gender gender;

	/**
	 * Is person in a particular group already? Uses existing set in groups because
	 * that is the only record of this information.
	 */
	boolean in_group(Integer group) {
		return this.groups.contains(group);
	}

	void add_group(Integer group) {
		this.groups.add(group);
	}
}
