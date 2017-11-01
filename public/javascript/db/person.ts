import * as jq from "jquery";
import { Document, Schema, Model, model} from "mongoose";

import {IGroup} from "./group";

export interface IPerson {
    first: string;
    middle?: string;
    last: string;
    hebrew?: string;
    groups: Array<IGroup>;
    birthdate?: string;
    deathdate?: string;
    hebrew_yahrzeit: boolean;
    gender: string;
    greeting?: string;
}

export interface IPersonModel extends IPerson, Document {

}

export var PersonSchema: Schema = new Schema({
    first: String,
    middle: String,
    last: String,
    hebrew: String,
    birthdate: Date,
    deathdate: Date,

});

PersonSchema.pre("save", function(next) {
    let now = new Date();
    if (!this.createdAt) {
        this.createdAt = now;
    }
    next();
});

PersonSchema.methods.fullName = function(): string {
    return (this.firstName.trim() + " " + this.lastName.trim());
};

export const Person: Model<IPersonModel> = model<IPersonModel>("Person", PersonSchema);
