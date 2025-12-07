-- this is while doing eclipse jdbc connection

show databases;
create database employee_db;
use employee_db;

create table employee(
	id int auto_increment primary key,
    name varchar(40),
    department varchar(50),
    salary double(10,2)
    );
desc employee;
select * from employee;