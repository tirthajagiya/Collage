CREATE TABLE EMPLOYEEDETAILS
(
	EmployeeID Int Primary Key,
	EmployeeName Varchar(100) Not Null,
	ContactNo Varchar(100) Not Null,
	Department Varchar(100) Not Null,
	Salary Decimal(10,2) Not Null,
	JoiningDate DateTime Null
)

CREATE TABLE EmployeeLogs (
    LogID INT PRIMARY KEY IDENTITY(1,1),
    EmployeeID INT NOT NULL,
    EmployeeName VARCHAR(100) NOT NULL,
    ActionPerformed VARCHAR(100) NOT NULL,
    ActionDate DATETIME NOT NULL
);

--1)	Create a trigger that fires AFTER INSERT, UPDATE, and DELETE operations on the EmployeeDetails table to display the message "Employee record inserted", "Employee record updated", "Employee record deleted"

CREATE OR ALTER TRIGGER TR_after_insert
ON EMPLOYEEDETAILS 
AFTER INSERT
AS
BEGIN
	print('Employee record inserted')
END

CREATE OR ALTER TRIGGER TR_after_update
ON EMPLOYEEDETAILS 
AFTER UPDATE
AS
BEGIN
	print('Employee record updated')
END

CREATE OR ALTER TRIGGER TR_after_delete
ON EMPLOYEEDETAILS 
AFTER DELETE
AS
BEGIN
	print('Employee record deleted')
END

--2)	Create a trigger that fires AFTER INSERT, UPDATE, and DELETE operations on the EmployeeDetails table to log all operations into the EmployeeLog table.

CREATE OR ALTER TRIGGER TR_insert_log
ON EMPLOYEEDETAILS
AFTER INSERT
AS
BEGIN
	DECLARE @EmployeeID INT;
	DECLARE @EmployeeName VARCHAR(50);

	SELECT @EmployeeID=EmployeeID FROM inserted;
	SELECT @EmployeeName=@EmployeeName FROM inserted;

	INSERT INTO EmployeeLogs VALUES (@EmployeeID,@EmployeeName,'INSERTED',GETDATE())
END

CREATE OR ALTER TRIGGER TR_update_log
ON EMPLOYEEDETAILS
AFTER UPDATE
AS
BEGIN
	DECLARE @EmployeeID INT;
	DECLARE @EmployeeName VARCHAR(50);

	SELECT @EmployeeID=EmployeeID FROM inserted;
	SELECT @EmployeeName=@EmployeeName FROM inserted;

	INSERT INTO EmployeeLogs VALUES (@EmployeeID,@EmployeeName,'UPDATED',GETDATE())
END

CREATE OR ALTER TRIGGER TR_delete_log
ON EMPLOYEEDETAILS
AFTER DELETE
AS
BEGIN
	DECLARE @EmployeeID INT;
	DECLARE @EmployeeName VARCHAR(50);

	SELECT @EmployeeID=EmployeeID FROM deleted;
	SELECT @EmployeeName=EmployeeName FROM deleted;

	INSERT INTO EmployeeLogs VALUES (@EmployeeID,@EmployeeName,'DELETED',GETDATE())
END

--3)	Create a trigger that fires AFTER INSERT to automatically calculate the joining bonus (10% of the salary) for new employees and update a bonus column in the EmployeeDetails table.

CREATE OR ALTER TRIGGER BONUS
ON EMPLOYEEDETAILS
AFTER INSERT
AS
BEGIN
	DECLARE @EmployeeID INT;
	DECLARE @Salary Decimal(10,2);

	SELECT @EmployeeID=EmployeeID FROM inserted;
	SELECT @Salary=Salary FROM inserted;

	UPDATE EMPLOYEEDETAILS
	SET Salary=Salary+(0.10*(Salary))
	WHERE EmployeeID=@EmployeeID
END

--4)	Create a trigger to ensure that the JoiningDate is automatically set to the current date if it is NULL during an INSERT operation.

--5)	Create a trigger that ensure that ContactNo is valid during insert and update (Like ContactNo length is 10)