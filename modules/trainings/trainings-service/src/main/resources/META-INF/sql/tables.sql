create table Sample_Training (
	uuid_ VARCHAR(75) null,
	trainingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	trainer VARCHAR(75) null,
	name VARCHAR(75) null,
	date_ DATE null,
	hours DOUBLE
);