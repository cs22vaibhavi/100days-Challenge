#table creation

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(100),
    dob DATE,
    course VARCHAR(50)
);

#insert Student Records
INSERT INTO students (id, name, email, dob, course)
VALUES
(1, 'Vaibhavi', 'vaibhavi@gmail.com', '2005-06-15', 'CSE'),
(2, 'Rahul', 'rahul@gmail.com', '2004-12-20', 'ECE'),
(3, 'Ananya', 'ananya@gmail.com', '2005-03-10', 'CSE');

SELECT * FROM students;
