"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var mc = require("mongodb");
var assert = require('assert');
var ps = require("src/crud/people");
// Connection URL
var url = 'mongodb://localhost:27017/test';
// Use connect method to connect to the Server
mc.connect(url, function (err, db) {
    assert.equal(null, err);
    console.log("Connected correctly to server");
    // Insert a single document
//    db.collection('test').insertOne({ a: 1 }, function (err, r) {
//        assert.equal(null, err);
//        assert.equal(1, r.insertedCount);
//        console.log("inserted 1");
//        // Insert multiple documents
//        db.collection('inserts').insertMany([{ a: 2 }, { a: 3 }], function (err, r) {
//            assert.equal(null, err);
//            assert.equal(2, r.insertedCount);
//            console.log("Inserted 2");
//            db.close();
//            console.log("Closed db");
//        });
//    });
    
    var p = new person();
    p.first_name = 'Albert';
    p.last_name  = 'Niceguy';
    db.collection('insertOne', p);
    console.log("Exit connect");
 });
