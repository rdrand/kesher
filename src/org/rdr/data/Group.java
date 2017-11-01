package org.rdr.data;

import java.util.List;

/*


class phone extends contact {
phone_number: string;
}

class email extends contact {
email: string;
}
*/

public enum GroupType {
	member, donor, prospects, household
}

public class Group {
	GroupType type;
	Integer group_id;
	String name;
	List<Address> addresses;
	List<Phone> phones;
	List<Email> emails;
}

