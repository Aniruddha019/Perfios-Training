# Description: VIM Exercise

### Description
1. Revise all the VIM concepts explained during training and do the following VIM exercise.
2. Export all data from the employees table using the MySQL load data command into the file `training_exercise_10_vim.csv`. 
3. Use VIM regular expression substitutions to convert the exported data to SQL insert statements. Example, let's say the exported data from MySQL is as follows

```
  10001    1953-09-02    Georgi    Facello    M    1986-06-26
  10002    1964-06-02    Bezalel    Simmel    F    1985-11-21
  10003    1959-12-03    Parto    Bamford    M    1986-08-28
```

After the VIM exercise, the insert statement should look like as follows

```
insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date) values (10000001, '1953-09-02', 'Georgi', 'Facello', 'M', '1986-06-26');
insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date) values (10000002, '1964-06-02', 'Bezalel',    'Simmel', 'F', '1985-11-21');
insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date) values (10000003, '1959-12-03', 'Parto', 'Bamford', 'M', '1986-08-28');
```

4. Write the VIM steps used in this exercise in a file `training_exercise_10_vim.md`.
5. Write the converted SQL statements in the file `training_exercise_10_vim.sql`.
6. Commit the files to perfios-training GitLab repository and send a merge request against the branch develop.
