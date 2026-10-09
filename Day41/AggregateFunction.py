#Count
1.SELECT COUNT(*) AS total_students
    FROM students;

#Avg
2.SELECT subject, AVG(marks) AS average_marks
     FROM students
    GROUP BY subject;

#max
3.SELECT MAX(fees) AS maximum_fees
      FROM students;

#min
4.SELECT MIN(fees) AS minimum_fees
     FROM students;
