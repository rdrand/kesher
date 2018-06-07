package org.rdr.kesher.data;

import java.util.Date;
import java.util.List;

public class Person {
	public enum Gender {
		male, female
	};

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
	private Long person_id;
	private String first;
	private String middle;
	private String last;
	private String hebrew;
	private List<Integer> groups;
	private Date birthdate;
	private Date deathdate;
	private Boolean hebrew_yahrzeit;
	private Gender gender;
	private List<Person> parents; // If known and in members
	
		public Long getPersonId() {
		return person_id;
	}

	public void setPersonId(Long personId) {
		this.person_id = person_id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getHebrew() {
		return hebrew;
	}

	public void setHebrew(String hebrew) {
		this.hebrew = hebrew;
	}

	public List<Integer> getGroups() {
		return groups;
	}

	public void setGroups(List<Integer> groups) {
		this.groups = groups;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getDeathdate() {
		return deathdate;
	}

	public void setDeathdate(Date deathdate) {
		this.deathdate = deathdate;
	}

	public Boolean getHebrewYahrzeit() {
		return hebrew_yahrzeit;
	}

	public void setHebrew_yahrzeit(Boolean hebrewYahrzeit) {
		this.hebrew_yahrzeit = hebrew_yahrzeit;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Person> getParents() {
		return parents;
	}

	public void setParents(List<Person> parents) {
		this.parents = parents;
	}

	/**
	 * Is person in a particular group already? Uses existing set in groups because
	 * that is the only record of this information.
	 */
	public boolean in_group(Integer group) {
		return this.groups.contains(group);
	}

	public void add_group(Integer group) {
		this.groups.add(group);
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", first=" + first + ", middle=" + middle + ", last=" + last
				+ ", hebrew=" + hebrew + ", groups=" + groups + ", birthdate=" + birthdate + ", deathdate=" + deathdate
				+ ", hebrew_yahrzeit=" + hebrew_yahrzeit + ", gender=" + gender + ", parents=" + parents + "]";
	}
	
	
}
