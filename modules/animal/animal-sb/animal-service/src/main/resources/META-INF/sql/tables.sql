create table Animal_PersistedAnimal (
	uuid_ VARCHAR(75) null,
	animalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	animalClass VARCHAR(75) null,
	numberOfLegs INTEGER
);