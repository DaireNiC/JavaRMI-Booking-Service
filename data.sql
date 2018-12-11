DROP DATABASE IF EXISTS carrental;

CREATE DATABASE carRental;

USE carRental;

DROP TABLE IF EXISTS address;

CREATE TABLE address(
	address_SID int NOT NULL AUTO_INCREMENT,
	street varchar(50),
	city varchar(20),
	county varchar(20),
	PRIMARY KEY (address_SID));
	
DROP TABLE IF EXISTS customer;

CREATE TABLE customer(
	customer_SID int NOT NULL AUTO_INCREMENT,
	firstName varchar(20),
	lastName varchar(20),
	address_SID varchar(10),
	PRIMARY KEY (customer_SID),
	FOREIGN KEY (address_SID) REFERENCES address(address_SID));
	
DROP TABLE IF EXISTS vehicle;

CREATE TABLE vehicle(
	vehicle_SID int NOT NULL AUTO_INCREMENT,
	vehiclePlate varchar(20),
	availableIndicator int,
	model varchar(50),
	PRIMARY KEY (vehicle_SID));
	
DROP TABLE IF EXISTS rentalOrder;

CREATE TABLE rentalOrder(
	rental_SID int NOT NULL AUTO_INCREMENT,
	orderDate date,
	pickUpDate date,
	dropOffDate date,
	vehicle_SID varchar(10),
	customer_SID varchar(10),
	PRIMARY KEY (rental_SID),
	FOREIGN KEY (vehicle_SID) REFERENCES vehicle(vehicle_SID),
	FOREIGN KEY (customer_SID) REFERENCES customer(customer_SID));
	

insert into address values (NULL , '10 Cill ard', 'Galway City', 'Galway');
insert into address values (NULL , '120 fancy road', 'LA', 'California');
insert into address values (NULL , '99 St', 'New york', 'New York');

insert into customer values (NULL, 'Bob', 'Joe', '1');
insert into customer values (NULL, 'Philip', 'King', '2');
insert into customer values (NULL, 'James', 'o shea', '3');

insert into vehicle values (NULL, 'ABCDE', 1, 'Audi r8');
insert into vehicle values (NULL, 'FGHIJ', 1, 'Toyota Hilux');
insert into vehicle values (NULL, 'KLMNO', 1, 'Mercedes C1');

insert into rentalOrder values (NULL, "2018-12-01", "2018-12-02", "2018-12-03","1","1");
insert into rentalOrder values (NULL, "2018-12-04", "2018-12-05", "2018-12-06","2","2");
insert into rentalOrder values (NULL, "2018-12-07", "2018-12-08", "2018-12-09","3","3");