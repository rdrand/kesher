const enum group_type { Member = 0, FormerMember = 1, Prospect = 2, Donor = 10, Grade = 3,
Yahrzeit = 4, Parent = 5, Adult = 6 }
const enum connection_type { Primary = 0, Work = 1, Home = 2, School = 3, Mobile = 4 }

import { Document, Schema, Model, model} from "mongoose";

export interface IGroup {
    id: string;
    type: group_type;
}

export var GroupSchema: Schema = new Schema({
    id: String,
    type: Number
});

class Contact {
    type: connection_type;
}

export class Address extends Contact {
    street1: string;
    street2: string;
    state: string;
    zip: string;
}

export class Phone extends Contact {
    area: string;
    number: string;
}

export class Email extends Contact {
    email: string;
}

export interface IContactGroup extends IGroup {
    addresses: Array<Address>;
    phones: Array<Phone>;
    emails: Array<Email>;
}

export var ContactGroupSchema: Schema = new Schema({
    id: String,
    type: Number,
    addresses: {
        type: Array,
        default: []
    },
    phones: {
        type: Array,
        default: []
    },
    emails: {
        type: Array,
        default: []
    }
});

export interface IGroupModel extends IGroup, Document {

}

export interface IContactGroupModel extends IContactGroup, Document {

}

export const ContactGroup: Model<IContactGroupModel> = model<IContactGroupModel>("ContactGroup", ContactGroupSchema);
