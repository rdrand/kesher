package org.rdr.kesher.data

import java.util.ArrayList
import java.util.UUID

/**
 * A group can represent a few different things. All contact information, phone numbers,
 * addresses and emails, are associated with a group. For each class of contact information
 * only one can be considered the primary. The primary contact info for a type will be the one
 * used in any automatically generated report that does not override that setting or online
 * display that shows summary information that does not explicity filter on some other value.
 *
 * Note that a person can be associated with multiple groups.
 *
 * A group such as a donor would contain the information for a single donor including
 * the contact people and how to contact the donor.
 *
 * A group such as a membership would be associated with one or more people. At least
 * one of the people would be associated with the group members. zero or more would be
 * associated with the group children.
 *
 * A group such as grade# (where # is determined by the religious school) is associated with
 * kids in that grade.
 *
 * @author rache
 *
 */
class Group {
	var type: GroupType? = null
	var name: String? = null
}