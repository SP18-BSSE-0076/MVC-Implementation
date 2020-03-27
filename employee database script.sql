create database Employee

use Employee

create table EmployeeDetails
(
EmployeeID int primary key not null,
FirstName varchar(50),
LastName varchar(50),
Gender varchar(50),
HiredDate varchar(50),
Salary int,
)

--)Select Query
select * from EmployeeDetails

--)Insertion Query
insert into EmployeeDetails values(1,'Muhammad','Atif','Male','9th October 1997',50000)

--)Update Query
update EmployeeDetails set Salary = 100000 where EmployeeID = 1

--)Deletion Query
delete EmployeeDetails where EmployeeID = 1