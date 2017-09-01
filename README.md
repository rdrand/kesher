# kesher
A system to track temple memberships, relationships and interactions

## Purpose
Managing information about temple membership is difficult and expensive. Commercial products can cost thousands but most of what is needed is fairly simple.
* Track groups related to the temple: members, member families, donors and other interested parties
* Related people to one another and track peoples heritage to allow for yahrzeit notification
* Track enrollment in the religious school
* Track contact history

## Goals
Present a modern active interface with a node.js backend and data stored in Mongodb. The backend will include the ability to upload data in some simple data format like CSV or TSV. Have a simple data model that only includes contact data associated with a group (family, donor, etc) and not individually with people for simplicity.

## Non-goals
This isn't trying to be a CRM solution or trying to feed other systems. It isn't meant to be a reporting solution although it should include some exports that can be used for merging to produce output from Word and othe programs. 
