package org.rdr.kesher.test.data;

import org.junit.jupiter.api.Test;
import org.rdr.kesher.data.Address;
import org.rdr.kesher.data.Contact.ContactType;
import org.rdr.kesher.data.Email;
import org.rdr.kesher.data.Group;
import org.rdr.kesher.data.GroupType;
import org.rdr.kesher.data.Person;
import org.rdr.kesher.data.Phone;
import org.springframework.data.mongodb.core.MongoTemplate;

public class TestPersonCrudOperations extends MongoTestBase {
	@Test
	public void testCreateGroupCollectionAndInstances() throws Exception {
		MongoTemplate tmpl = getTemplate();
		
		tmpl.dropCollection(Group.class);
		
		Group a = new Group();
		a.setName("foo");
		a.setType(GroupType.donor);
		
		tmpl.insert(a);
		
		Group b = new Group();
		b.setName("Jacob Family");
		Person p = new Person("Jacob", "Solomon", "Katz");
		b.setType(GroupType.membership);
		p.add_address(new Address(ContactType.primary, "1 Post Rd", "Sudbury", 
				"MA", "01234"));
		p.add_email(new Email(ContactType.primary, "jacob.weiner@gmail.com"));
		p.add_phone(.add(new Phone(ContactType.primary, "123-456-7890"));
		
		tmpl.insert(b);
	}
}
