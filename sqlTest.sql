-- LIST OF EXERCISES
-- 1.	Select all employees who have any degree in “BA”.
Select * From Employees Where Notes Like "%BA%";

-- 2.	Display how many orders were processed by each employee. Display Employees Last Name, First Name and amount of orders;
SELECT Employees.LastName, Employees.FirstName, COUNT(Orders.OrderID) AS NumberOfOrders
FROM Employees JOIN Orders ON Orders.EmployeeID  = Employees.EmployeeID
Group by Employees.EmployeeID;

-- 3.	Display how many orders were made by each Shipper. Display Shipper's name and "Amount of processed orders".
SELECT ShipperName, count(Shippers.ShipperID) as Amount_Of_Processed_Orders
FROM Shippers Join Orders On Shippers.ShipperID = Orders.ShipperID
Group by Orders.ShipperID
