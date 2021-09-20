use practice;
create table t1(
id int,
full_name varchar(20)
);

create table t2(
id varchar(20),
email varchar(20)
);

insert into t1 values(1,'pooja doke');
insert into t1 values(2,'pallavi doke');
insert into t1 values(3,'komal kale');
insert into t1 values(4,'neha gore');

insert into t2 values('1','pooja@gmail.com');
insert into t2 values('4','komal@gmail.com');
insert into t2 values('2','mina@gmail.com');

select *from t1 cross join t2;
select *from t1 inner join t2 where t1.id=t2.id;
SELECT *FROM t1 FULL OUTER JOIN t2 ON t1.id = t2.id;
