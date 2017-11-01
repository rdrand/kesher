//Group
//
//A group is one unit of people. A group can contain any number of people. People reference a group to express membership. Groups belong to a single type. Some uses will be small such as member households that may have between one and several associated people, and some groups will be large such as all the yahrzeits or all the donors.
//
//id - an assigned unique numeric id that will never be reused.
//type integer
//addresses { the addresses type below embedded }
//phones { phone_number, type } - no more than one must be marked primary
//emails { email } - no more than one must be marked primary
//Address
//
//type - no more than one address must be labelled primary if there are any addresses
//label_name - a name used in sending postal mail to the group. Defaults to the first two people. If the first two people share the same last name it will default to firstname1 and firstname2 lastname. For other kinds of groups this would be the company name
//line1 - First line of the postal address
//line2 - Second line of the postal address
//city
//state
//zip

class contact {
  contact_type: number;
}

class phone extends contact {
  phone_number: string;
}

class email extends contact {
  email: string;
}

class address extends contact {
  label_name: string;
  line1: string;
  line2: string;
  city: string;
  state: string;
  zip: string;
}

class group {
	group_type: number;
  group_id: number;
  group_name: string;
  addresses: address[];
  phones: phone[];
  emails: email[];
}