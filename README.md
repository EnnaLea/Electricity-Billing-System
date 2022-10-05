## Getting Started

1 - Create  a database
create database named ebs;

2 - Create login table:
meter_no varchar(20), username varchar(30), password(30), user varchar(30);

3 -  Create customer table:
name varchar (30), meter varchar(30), address varchar(50), state varchar(30), email varchar(30), phone varchar(20);

4 - Create meter_info table:
meter_number varchar(20), meter_location varchar(20), meter_type varchar(20), phase_code varchar(20), bill_type varchar(20), days varchar(20);

5 - Create tax table:
cost_per_unit varchar(20), meter_rent varchar(20), service_charge varchar(20), service_tax varchar(20), swacch_bharat_cess varchar(20), fixed_tax varchar(20);

6 - Insert some value in the table tax:
('9', '47', '22', '57', '6', ''18,);

7 - Create bill table:
meter varchar(20), month varchar(20), units varchar (20), total_bill varchar(20), status varchar(20);





