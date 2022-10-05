## Getting Started

1 - Create  a database
create database ebs;

2 - Create login table:
login (meter_no VARCHAR(20), username VARCHAR(30), password VARCHAR(30), user VARCHAR(30));

3 -  Create customer table:
name VARCHAR (30), meter VARCHAR(30), address VARCHAR(50), state VARCHAR(30), email VARCHAR(30), phone VARCHAR(20);

4 - Create meter_info table:
meter_number VARCHAR(20), meter_location VARCHAR(20), meter_type VARCHAR(20), phase_code VARCHAR(20), bill_type VARCHAR(20), days VARCHAR(20);

5 - Create tax table:
cost_per_unit VARCHAR(20), meter_rent VARCHAR(20), service_charge VARCHAR(20), service_tax VARCHAR(20), swacch_bharat_cess VARCHAR(20), fixed_tax VARCHAR(20);

6 - Insert some value in the table tax:
('9', '47', '22', '57', '6', '18');

7 - Create bill table:
meter VARCHAR(20), month VARCHAR(20), units VARCHAR (20), total_bill VARCHAR(20), status VARCHAR(20);





