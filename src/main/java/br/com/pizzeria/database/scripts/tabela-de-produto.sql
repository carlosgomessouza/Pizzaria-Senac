CREATE TABLE Product (
ProductID int auto_increment PRIMARY KEY,
Name varchar(280),
Cost decimal(15,2),
ProductValue decimal(15,2),
CurrentStock int,
ProductTypeID int
);