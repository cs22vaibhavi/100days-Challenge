##Update
UPDATE students
SET email = 'vaibhavi2026@gmail.com'
WHERE id = 1;

##Modify
ALTER TABLE students
MODIFY course_fees DECIMAL(10,2);


##Delete
START TRANSACTION;

DELETE FROM students
WHERE is_active = 0;

-- If the result is correct:
COMMIT;


