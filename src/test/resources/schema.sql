TRUNCATE table T_TECHNICIAN CASCADE;

drop table if exists T_CUSTOMER;
create table T_CUSTOMER(
ID serial primary key,
NAME varchar(50) not null,
AGE varchar(9),
ADDRESS varchar(50),
EMAIL varchar(40),
FREQUENCY_NEWS varchar(15),
GENDER varchar(15),
RECEIVE_NEWSLETTER boolean
);
