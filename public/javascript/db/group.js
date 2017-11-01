"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var mongoose_1 = require("mongoose");
exports.GroupSchema = new mongoose_1.Schema({
    id: String,
    type: Number
});
var Contact = (function () {
    function Contact() {
    }
    return Contact;
}());
var Address = (function (_super) {
    __extends(Address, _super);
    function Address() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Address;
}(Contact));
exports.Address = Address;
var Phone = (function (_super) {
    __extends(Phone, _super);
    function Phone() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Phone;
}(Contact));
exports.Phone = Phone;
var Email = (function (_super) {
    __extends(Email, _super);
    function Email() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Email;
}(Contact));
exports.Email = Email;
exports.ContactGroupSchema = new mongoose_1.Schema({
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
exports.ContactGroup = mongoose_1.model("ContactGroup", exports.ContactGroupSchema);
