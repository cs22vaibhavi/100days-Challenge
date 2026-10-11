CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO students VALUES
(1, 'Anu'),
(2, 'Rahul'),
(3, 'Priya');

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50),
    instructor VARCHAR(50),
    schedule VARCHAR(50)
);

INSERT INTO courses VALUES
(101, 'Java', 'Mr. Kumar', 'Monday 10 AM'),
(102, 'DBMS', 'Ms. Priya', 'Tuesday 11 AM'),
(103, 'Python', 'Mr. Ravi', 'Wednesday 2 PM');

CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

INSERT INTO enrollments VALUES
(1, 101),
(1, 102),
(2, 103),
(3, 101);

SELECT
    students.name,
    courses.course_name,
    courses.instructor,
    courses.schedule
FROM students
INNER JOIN enrollments
    ON students.id = enrollments.student_id
INNER JOIN courses
    ON enrollments.course_id = courses.course_id
ORDER BY students.name;
