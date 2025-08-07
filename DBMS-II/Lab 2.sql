-- Create Department Table
CREATE TABLE Department (
 DepartmentID INT PRIMARY KEY,
 DepartmentName VARCHAR(100) NOT NULL UNIQUE
);
-- Create Designation Table
CREATE TABLE Designation (
 DesignationID INT PRIMARY KEY,
 DesignationName VARCHAR(100) NOT NULL UNIQUE
);
-- Create Person Table
CREATE TABLE Person (
 PersonID INT PRIMARY KEY IDENTITY(101,1),
 FirstName VARCHAR(100) NOT NULL,
 LastName VARCHAR(100) NOT NULL,
 Salary DECIMAL(8, 2) NOT NULL,
 JoiningDate DATETIME NOT NULL,
 DepartmentID INT NULL,
 DesignationID INT NULL,
 FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
 FOREIGN KEY (DesignationID) REFERENCES Designation(DesignationID)
);

SELECT *FROM Department;

SELECT *FROM Designation;

SELECT *FROM Person;

--Part – A
--1. Department, Designation & Person Table’s INSERT, UPDATE & DELETE Procedures.

CREATE OR ALTER PROCEDURE PR_DEPARTMENT_INSERT
@DepartmentID INT ,
@DepartmentName VARCHAR(50)
AS
BEGIN
INSERT INTO Department (DepartmentID,DepartmentName) VALUES (@DepartmentID,@DepartmentName)
END

CREATE OR ALTER PROCEDURE PR_DEPARTMENT_UPDATE
@DepartmentID INT,
@DepartmentName VARCHAR(50)
AS
BEGIN
UPDATE Department
SET DepartmentName=@DepartmentName
WHERE DepartmentID=@DepartmentID
END

CREATE OR ALTER PROCEDURE PR_DEPARTMENT_DELETE
@DepartmentID INT
AS
BEGIN
DELETE FROM Department
WHERE DepartmentID=@DepartmentID
END

CREATE OR ALTER PROCEDURE PR_DESIGNATION_INSERT
@DesignationID INT ,
@DesignationName VARCHAR(50)
AS
BEGIN
INSERT INTO Designation(DesignationID,DesignationName) VALUES (@DesignationID,@DesignationName)
END

CREATE OR ALTER PROCEDURE PR_DESIGNATION_UPDATE
@DesignationID INT,
@DesignationName VARCHAR(50)
AS
BEGIN
UPDATE Designation
SET DesignationID=@DesignationID
WHERE DesignationName=@DesignationName
END

CREATE OR ALTER PROCEDURE PR_DESIGNATION_DELETE
@DesignationID INT
AS
BEGIN
DELETE FROM Designation
WHERE DesignationID=@DesignationID;
END

CREATE OR ALTER PROCEDURE PR_PERSON_INSERT
@FirstName VARCHAR(50),
@LastName VARCHAR(50),
@Salary Decimal (8,2),
@JoiningDate Datetime,
@DepartmentID INT,
@DesignationID INT
AS
BEGIN
INSERT INTO Person (FirstName,LastName,Salary,JoiningDate,DepartmentID,DesignationID) VALUES (@FirstName,@LastName,@Salary,@JoiningDate,@DepartmentID,@DesignationID)
END

CREATE OR ALTER PROCEDURE PR_PERSON_UPDATE
@PersonID INT,
@FirstName VARCHAR(50),
@LastName VARCHAR(50),
@Salary Decimal (8,2),
@JoiningDate Datetime,
@DepartmentID INT,
@DesignationID INT
AS
BEGIN
UPDATE Person
SET FirstName=@FirstName,LastName=@LastName,Salary=@Salary,JoiningDate=@JoiningDate,DepartmentID=@DepartmentID,DesignationID=@DesignationID
WHERE PersonID=@PersonID;
END

CREATE OR ALTER PROCEDURE PR_PERSON_DELETE
@PersonID INT,
@FirstName VARCHAR(50),
@LastName VARCHAR(50),
@Salary Decimal (8,2),
@JoiningDate Datetime,
@DepartmentID INT,
@DesignationID INT
AS
BEGIN
DELETE FROM Person
WHERE PersonID=@PersonID;
END
--2. Department, Designation & Person Table’s SELECTBYPRIMARYKEY

CREATE OR ALTER PROCEDURE PR_Department_SELECTBYPRIMARYKEY
@DepartmentID INT
AS
BEGIN
SELECT * FROM Department 
WHERE DepartmentID=@DepartmentID;
END

CREATE OR ALTER PROCEDURE PR_Designation_SELECTBYPRIMARYKEY
@DesignationID INT
AS
BEGIN
SELECT * FROM Designation 
WHERE DesignationID=@DesignationID;
END

CREATE OR ALTER PROCEDURE PR_Person_SELECTBYPRIMARYKEY
@PersonID INT
AS
BEGIN
SELECT * FROM Person 
WHERE PersonID=@PersonID;
END
--3. Department, Designation & Person Table’s (If foreign key is available then do write join and take
--columns on select list)

CREATE OR ALTER PROCEDURE PR_Person_foreign
AS
BEGIN
SELECT * FROM Person JOIN Department ON Person.DepartmentID=Department.DepartmentID JOIN Designation ON Person.DesignationID=Designation.DesignationID
END

EXEC PR_Person_foreign
--4. Create a Procedure that shows details of the first 3 persons.

CREATE OR ALTER PROCEDURE PR_Person_first_3_persons
AS
BEGIN
SELECT TOP 3 * FROM Person
END
--Part – B
--5. Create a Procedure that takes the department name as input and returns a table with all workers
--working in that department.
--6. Create Procedure that takes department name & designation name as input and returns a table with
--worker’s first name, salary, joining date & department name.
--7. Create a Procedure that takes the first name as an input parameter and display all the details of the
--worker with their department & designation name.
--8. Create Procedure which displays department wise maximum, minimum & total salaries.
--9. Create Procedure which displays designation wise average & total salaries.
--Part – C
--10. Create Procedure that Accepts Department Name and Returns Person Count.
--11. Create a procedure that takes a salary value as input and returns all workers with a salary greater than
--input salary value along with their department and designation details.
--12. Create a procedure to find the department(s) with the highest total salary among all departments.
--13. Create a procedure that takes a designation name as input and returns a list of all workers under that
--designation who joined within the last 10 years, along with their department.
--14. Create a procedure to list the number of workers in each department who do not have a designation
--assigned.
--15. Create a procedure to retrieve the details of workers in departments where the average salary is above
--12000.