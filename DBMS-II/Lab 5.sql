-- Creating PersonInfo Table
CREATE TABLE PersonInfo (
 PersonID INT PRIMARY KEY,
 PersonName VARCHAR(100) NOT NULL,
 Salary DECIMAL(8,2) NOT NULL,
 JoiningDate DATETIME NULL,
 City VARCHAR(100) NOT NULL,
 Age INT NULL,
 BirthDate DATETIME NOT NULL
);
-- Creating PersonLog Table
CREATE TABLE PersonLog (
 PLogID INT PRIMARY KEY IDENTITY(1,1),
 PersonID INT NOT NULL,
 PersonName VARCHAR(250) NOT NULL,
 Operation VARCHAR(50) NOT NULL,
 UpdateDate DATETIME NOT NULL
);

--Part – A
--1. Create a trigger that fires on INSERT, UPDATE and DELETE operation on the PersonInfo table to display
--a message “Record is Affected.”

CREATE OR ALTER TRIGGER tr_Message
ON PersonInfo
AFTER INSERT,UPDATE,DELETE
AS
BEGIN
	PRINT 'Record is Affected.'
END

--2. Create a trigger that fires on INSERT, UPDATE and DELETE operation on the PersonInfo table. For that,
--log all operations performed on the person table into PersonLog.

CREATE OR ALTER TRIGGER tr_make_log_INSERT
ON PersonInfo
AFTER INSERT
AS
BEGIN
	DECLARE @PersonId int;
	DECLARE @PersonName varchar(50);

	SELECT @PersonId=PersonID FROM inserted;
	SELECT @PersonName=PersonName FROM inserted;

	INSERT INTO PersonLog VALUES(@PersonId,@PersonName,'INSERT',GETDATE());
END

CREATE OR ALTER TRIGGER tr_make_log_UPDATE
ON PersonInfo
AFTER UPDATE
AS
BEGIN
	DECLARE @PersonId int;
	DECLARE @PersonName varchar(50);

	SELECT @PersonId=PersonID FROM inserted;
	SELECT @PersonName=PersonName FROM inserted;

	INSERT INTO PersonLog VALUES(@PersonId,@PersonName,'UPDATE',GETDATE());
END

CREATE OR ALTER TRIGGER tr_make_log_DELETE
ON PersonInfo
AFTER DELETE
AS
BEGIN
	DECLARE @PersonId int;
	DECLARE @PersonName varchar(50);

	SELECT @PersonId=PersonID FROM deleted;
	SELECT @PersonName=PersonName FROM deleted;

	INSERT INTO PersonLog VALUES(@PersonId,@PersonName,'DELETE',GETDATE());
END

--3. Create an INSTEAD OF trigger that fires on INSERT, UPDATE and DELETE operation on the PersonInfo
--table. For that, log all operations performed on the person table into PersonLog.

CREATE OR ALTER tr_insert_instead
ON PersonInfo
INSTEAD OF INSERT 
ASf
BEGIN
	DECLARE @PersonId int;
	DECLARE @PersonName varchar(50);

	SELECT @PersonId=PersonID FROM inserted;
	SELECT @PersonName=PersonName FROM inserted;
END

--4. Create a trigger that fires on INSERT operation on the PersonInfo table to convert person name into
--uppercase whenever the record is inserted.


CREATE OR ALTER TRIGGER tr_NAME_UPPER
ON PersonInfo
AFTER INSERT
AS
BEGIN
	DECLARE @PersonId int;
	DECLARE @PersonName varchar(50);

	SELECT @PersonId=PersonID FROM inserted;
	SELECT @PersonName=PersonName FROM inserted;

	UPDATE PersonInfo
	SET @PersonName=UPPER(@PersonName)
	WHERE PersonID=@PersonId
END
--5. Create trigger that prevent duplicate entries of person name on PersonInfo table.
--6. Create trigger that prevent Age below 18 years.
--Part – B
--7. Create a trigger that fires on INSERT operation on person table, which calculates the age and update
--that age in Person table.
--8. Create a Trigger to Limit Salary Decrease by a 10%.
--Part – C
--9. Create Trigger to Automatically Update JoiningDate to Current Date on INSERT if JoiningDate is NULL
--during an INSERT.
--10. Create DELETE trigger on PersonLog table, when we delete any record of PersonLog table it prints
--‘Record deleted successfully from PersonLog’.