Generate department wise student count report showing only department with >3 students

SELECT department, COUNT(*) AS total_students
FROM students
GROUP BY department
HAVING COUNT(*) > 3;
