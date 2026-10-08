-- 1. Create Table

CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    department VARCHAR(20),
    marks INT,
    city VARCHAR(50)
);


-- 2. Insert Data

INSERT INTO students VALUES
(1, 'Vaibhavi', 21, 'CSE', 85,'Kumta'),
(2, 'Anu', 20, 'CSE', 72,'Mangalore'),
(3, 'Rahul', 22, 'ECE', 91,'Bangalore'),
(4, 'Priya', 21, 'CSE', 65,'Udupi'),
(5, 'Kiran', 22, 'ECE', 78,'Mysore');


-- 3. Display all students

SELECT * FROM students;


-- 4. Select specific columns

SELECT name, marks
FROM students;


-- 5. WHERE

SELECT *
FROM students
WHERE marks > 80;


-- 6. CSE students

SELECT *
FROM students
WHERE department = 'CSE';


-- 7. AND

SELECT name, department, marks
FROM students
WHERE department = 'CSE'
AND marks > 70;


-- 8. OR

SELECT name, department
FROM students
WHERE department = 'CSE'
OR department = 'ECE';


-- 9. ORDER BY - Highest marks first

SELECT name, marks
FROM students
ORDER BY marks DESC;


-- 10. ORDER BY - Lowest marks first

SELECT name, marks
FROM students
ORDER BY marks ASC;


-- 11. LIMIT - Highest scoring student

SELECT name, marks
FROM students
ORDER BY marks DESC
LIMIT 1;


-- 12. DISTINCT

SELECT DISTINCT department
FROM students;
