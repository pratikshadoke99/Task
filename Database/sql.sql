create database mit;
use mit;
create table mech(
sno int(6),
sname varchar(20),
s_email varchar(20),
s_contact int(10)
);
create table ece(
sno int(6),
sname varchar(20),
s_email varchar(20),
s_contact int(10)
);
create table cse(
sno int(6),
sname varchar(20),
s_email varchar(20),
s_contact int(10)
);
show tables from mit;
insert into mech values
(1,"abc","abc@gmail.com",12345678),
(2,"def","def@gmail.com",09876543),
(4,"jkl","jkl@gmail.com",34567890),
(5,"mno","mno@gmail.com",45678901),
(6,"por","por@gmail.com",56789012),
(7,"stu","stu@gmail.com",67890123),
(8,"vwx","vwx@gmail.com",78901234),
(9,"xyz","xyz@gmail.com",89012345),
(10,"vas","vas@gmail.com",9012345);
select * from mech;
select sname from mech where(sname="abc");
use mit;
insert into ece values
(1,"abc","abc@gmail.com",12345678),
(2,"def","def@gmail.com",09876543),
(4,"jkl","jkl@gmail.com",34567890),
(5,"mno","mno@gmail.com",45678901),
(6,"por","por@gmail.com",56789012),
(7,"stu","stu@gmail.com",67890123),
(8,"vwx","vwx@gmail.com",78901234),
(9,"xyz","xyz@gmail.com",89012345),
(10,"vas","vas@gmail.com",9012345);

insert into cse values
(1,"abc","abc@gmail.com",12345678),
(2,"def","def@gmail.com",09876543),
(4,"jkl","jkl@gmail.com",34567890),
(5,"mno","mno@gmail.com",45678901),
(6,"por","por@gmail.com",56789012),
(7,"stu","stu@gmail.com",67890123),
(8,"vwx","vwx@gmail.com",78901234),
(9,"xyz","xyz@gmail.com",89012345),
(10,"vas","vas@gmail.com",9012345);
desc mech;
ALTER TABLE mech DROP COLUMN country;
alter table mech add(country varchar(12) default 'india');
select *from mech;

ALTER TABLE mech Modify column sno int(10);  
alter table mech change column sno roll varchar(5);
select *from mech;
delete from mech where sname='abc';
update mech set country='japan' where roll=2;