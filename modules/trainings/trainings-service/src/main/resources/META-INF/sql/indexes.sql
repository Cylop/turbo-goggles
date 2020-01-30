create index IX_8AF7B951 on Sample_Training (name[$COLUMN_LENGTH:75$], trainer[$COLUMN_LENGTH:75$]);
create index IX_D070670 on Sample_Training (trainer[$COLUMN_LENGTH:75$]);
create index IX_33840289 on Sample_Training (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BA0D974B on Sample_Training (uuid_[$COLUMN_LENGTH:75$], groupId);