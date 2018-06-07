package org.rdr.kesher.repository;

import org.rdr.kesher.data.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
