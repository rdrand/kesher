// Basic person definition

class person {
  person_id: string; // id - each person is assigned an alphanumeric id. There are a few candidates. One is to use an assigned number, but as this id needs to match up in a mongo database and there's no referential integrity control, this seems less than idea. Email would work for modern people. For older or deceased people first-last-birthyear would likely work well (and could work for modern people as well). While rdms design avoids natural keys like this, for a small database, especially one that needs to be joined from external data, it seems ideal.
  first, middle, last, hebrew: string;
  groups: number[]; // an array of zero or more groups this person is associated with
  birthdate: string: // (gregorian, hebrew can be derived) expressed as mm/dd/yyyy
  deathdate: string; // (gregorian, hebrew can be derived) expressed as mm/dd/yyyy
  hebrew_yarhzeit: boolean; (true if deceased and converting to hebrew date)
  gender: string; // (m/f, other?)
  greeting: string; // (mr, miss, ms, mrs, dr)

  /**
   * Is person in a particular group already? Uses existing set in groups because that is
   * the only record of this information.
   */
  in_group(group: number) {
    return this.groups.contains(group);
  }

  add_group(group: number) {
    this.groups.push(group);
  }
}