use practice;
show tables;
select *from persons;
desc persons;
alter table persons modify age int ;
alter table persons drop constraint not null fname; 
Truncate table persons;
drop table persons;
create table persons(
id int,
lname varchar(20) not null,
fname varchar(20),
age int,
constraint uc_persons unique(id)
);
alter table persons drop index uc_persons;
alter table persons add constraint uc_persons unique(id,fname);