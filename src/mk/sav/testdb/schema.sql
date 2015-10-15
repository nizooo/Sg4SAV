drop table T_CUSTOMER if exists;

create table T_CUSTOMER(ID integer identity primary key,NUMBER varchar(9), NAME varchar(50) not null );