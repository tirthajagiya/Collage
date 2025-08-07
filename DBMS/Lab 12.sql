--Part – A:
--1. Find all persons with their department name & code.

SELECT PERSON.PersonName,DEPT.DepartmentName,DEPT.DepartmentCode
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID=DEPT.DepartmentID;

--2. Find the person's name whose department is in C-Block.

SELECT PERSON.PersonName
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID=DEPT.DepartmentID
WHERE DEPT.Location='C-Block';

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.

SELECT PERSON.PersonName,PERSON.Salary,DEPT.DepartmentName
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID=DEPT.DepartmentID
WHERE PERSON.City='Jamnagar';

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.

SELECT PERSON.PersonName,PERSON.Salary,DEPT.DepartmentName
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID=DEPT.DepartmentID
WHERE not PERSON.City='Rajkot';

--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.

SELECT PERSON.PersonName,PERSON.JoiningDate
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID=DEPT.DepartmentID
WHERE DEPT.DepartmentName='Civil' AND PERSON.JoiningDate>'1-Aug-2001';

--6. Find details of all persons who belong to the computer department.

SELECT * FROM PERSON JOIN DEPT
ON PERSON.DepartmentID=DEPT.DepartmentID
WHERE DEPT.DepartmentName='Computer';

--7. Display all the person's name with the department whose joining date difference with the current date



--is more than 365 days.
--8. Find department wise person counts.
--9. Give department wise maximum & minimum salary with department name.
--10. Find city wise total, average, maximum and minimum salary.
--11. Find the average salary of a person who belongs to Ahmedabad city.
--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In
--single column)
--Part – B:
--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In
--single column)
--2. Find city & department wise total, average & maximum salaries.
--3. Find all persons who do not belong to any department.
--4. Find all departments whose total salary is exceeding 100000.
--Part – C:
--1. List all departments who have no person.
--2. List out department names in which more than two persons are working.
--3. Give a 10% increment in the computer department employee’s salary. (Use Update)