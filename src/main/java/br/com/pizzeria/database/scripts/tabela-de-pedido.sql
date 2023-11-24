CREATE TABLE Orders (
  OrderID int auto_increment PRIMARY KEY,
  Discount int,
  Name varchar(280),
  Total int,
  OrderDate date,
  ZipCode int,
  AddressNumber int,
  Address varchar(280),
  ClientID int,
  FOREIGN KEY (ClientID) REFERENCES Client(ClientID)
);

CREATE TABLE OrderProduct (
  OrderProductID int auto_increment PRIMARY KEY,
  NameOrder varchar(280),
  ValueOrder decimal,
  ProductAmount int,
  OrderID int,
  ProductID int,
  FOREIGN KEY (OrderID) REFERENCES Orders (OrderID),
  FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);