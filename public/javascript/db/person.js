"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var mongoose_1 = require("mongoose");
exports.PersonSchema = new mongoose_1.Schema({
    first: String,
    middle: String,
    last: String,
    hebrew: String,
    birthdate: Date,
    deathdate: Date,
});
exports.PersonSchema.pre("save", function (next) {
    var now = new Date();
    if (!this.createdAt) {
        this.createdAt = now;
    }
    next();
});
exports.PersonSchema.methods.fullName = function () {
    return (this.firstName.trim() + " " + this.lastName.trim());
};
exports.Person = mongoose_1.model("Person", exports.PersonSchema);
