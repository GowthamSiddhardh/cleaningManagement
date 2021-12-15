------WMS_admin-----
create table WMS_admin(
admin_email varchar2(20) unique,
admin_pwd varchar2(20) not null);

insert into WMS_admin values('Gowtham@gmail.com',87654321);
commit;
select * from WMS_admin;
desc WMS_admin

---------WMS_user-------
create table WMS_user(user_id number GENERATED ALWAYS AS IDENTITY START WITH  201  primary key,
user_email  varchar2(20)unique,
user_name varchar2(20) not null,
user_pwd varchar2(15) not null,
Address varchar2(50) not null, 
mobile_no number not null,
location varchar2(20));

desc WMS_user 

------WMS_location----
create table WMS_location(location_id  number primary key,location_name varchar2(20));

  -----WMS_employee--------
create table WMS_employee(emp_id  number GENERATED ALWAYS AS IDENTITY START WITH  301  primary key,
emp_email varchar2(20) unique,
emp_name varchar2(20) not null,
emp_pwd varchar2(15) not null);
select * from WMS_employee;
delete * from 

desc WMS_employee


----WMS_calculation--------
create table WMS_calculation(weight_kg number, categories varchar2(20) primary key,amount number);
 
desc WMS_calculation

  -----WMS_request--------
create table WMS_request(request_id number GENERATED ALWAYS AS IDENTITY START WITH  401  primary key,
user_id number,
emp_id number,
category varchar2(20),
location varchar2(20),
status varchar2(20) default 'pending',
foreign key (user_id) references WMS_user(user_id),
foreign key (emp_id) references WMS_employee(emp_id),
foreign key (category) references WMS_calculation(categories));

desc WMS_request
















