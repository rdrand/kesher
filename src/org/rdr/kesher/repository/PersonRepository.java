package org.rdr.kesher.repository;

import java.util.List;

import org.rdr.kesher.data.Address;
import org.rdr.kesher.data.Email;
import org.rdr.kesher.data.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
