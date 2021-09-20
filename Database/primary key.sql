show databases;
use practice;
show tables;
drop table persons;
create table persons(
id int primary key ,
fname varchar(20),
lname varchar(20) 

/*constraint temp primary key(id,lname,fname,age)*/
);
desc persons;
alter table persons add primary key(id);
alter table persons add constraint temp primary key (lname,fname);
insert into persons values(101,'jayanth','v');
insert into persons values(102,'ragini','p');
insert into persons values(103,'pooja','b');
select *from persons;
create table orders(
orderid int,
onumber int ,
id int,
foreign key(id)references persons(id)
);
drop table orders;
insert into orders values(1,77895,103);
insert into orders values(2,44678,103);
insert into orders values(3,22456,102);
insert into orders values(5,24562,105);
select *from orders;

alter table orders add foreign key(id)references persons(id);
alter table orders add constraint temp foreign key (id) references persons(id);
alter table orders drop foreign key temp ;
desc orders;
drop table member;
create table member(
id int,
name varchar(20),
check (id>=10)
);
insert into member values(1,'poi');


