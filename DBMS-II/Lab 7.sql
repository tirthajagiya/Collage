--Part – A
-- Create the Customers table
CREATE TABLE Customers (
 Customer_id INT PRIMARY KEY,
 Customer_Name VARCHAR(250) NOT NULL,
 Email VARCHAR(50) UNIQUE
);
-- Create the Orders table
CREATE TABLE Orders (
 Order_id INT PRIMARY KEY,
 Customer_id INT,
 Order_date DATE NOT NULL,
 FOREIGN KEY (Customer_id) REFERENCES Customers(Customer_id)
);
--1. Handle Divide by Zero Error and Print message like: Error occurs that is - Divide by zero error.

CREATE OR ALTER PROCEDURE PR_DIVISON
@num1 int, @num2 int
AS
BEGIN
	declare @result INT;
	BEGIN TRY 
		set @result = @num1 / @num2
		PRINT @result;
	END TRY
	BEGIN CATCH
		PRINT 'Error occurs that is - Divide by zero error.'
	END CATCH
END

EXEC PR_DIVISON 10,0;
--2. Try to convert string to integer and handle the error using try…catch block.

BEGIN TRY
	DECLARE @STR VARCHAR(50) ='DFGH', @CONVERT_INT INT;
	SET @CONVERT_INT = CAST(@STR AS int)
	PRINT @CONVERT_INT

END TRY
BEGIN CATCH
	PRINT 'CAN NOT CONVERT INTO INT'
END CATCH

--3. Create a procedure that prints the sum of two numbers: take both numbers as integer & handle
--exception with all error functions if any one enters string value in numbers otherwise print result.

CREATE OR ALTER PROCEDURE PR_SUM_ERROR
@num1 int, @num2 int
AS
BEGIN
	declare @result INT;
	BEGIN TRY 
		set @result = @num1 + @num2
		PRINT 'SUM IS : ' + CAST(@result AS VARCHAR(50));
	END TRY
	BEGIN CATCH
		PRINT 'ERROR NUMBER: ' + CAST(error_number() As varchar(10))
		PRINT 'ERROR SEVERITY: ' + CAST(error_SEVERITY() As varchar(10))
		PRINT 'ERROR STATE: ' + CAST(error_STATE() As varchar(10))
		PRINT 'ERROR MESSAGE: ' + CAST(error_MESSAGE() As varchar(10))
	END CATCH
END

EXEC PR_SUM_ERROR 10 ,0;

--4. Handle a Primary Key Violation while inserting data into customers table and print the error details
--such as the error message, error number, severity, and state.

BEGIN TRY
	insert into CUSTOMERS values (1,'abc','abc@123')
END TRY
BEGIN CATCH
	PRINT 'ERROR NUMBER: ' + CAST(error_number() As varchar(10))
	PRINT 'ERROR SEVERITY: ' + CAST(error_SEVERITY() As varchar(10))
	PRINT 'ERROR STATE: ' + CAST(error_STATE() As varchar(10))
	PRINT 'ERROR MESSAGE: ' + CAST(error_MESSAGE() As varchar(10))
END CATCH

select * from CUSTOMERS

--5. Throw custom exception using stored procedure which accepts Customer_id as input & that throws
--Error like no Customer_id is available in database.

CREATE OR ALTER PROCEDURE PR_

--Part – B
--6. Handle a Foreign Key Violation while inserting data into Orders table and print appropriate error
--message.
--7. Throw custom exception that throws error if the data is invalid.
--8. Create a Procedure to Update Customer’s Email with Error Handling
--Part – C
--9. Create a procedure which prints the error message that “The Customer_id is already taken. Try another
--one”.
--10. Handle Duplicate Email Insertion in Customers Table.