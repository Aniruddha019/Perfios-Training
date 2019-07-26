
### Exercise 2 Mysql

1. List the name of departments where atleast 2 employees are working in that department.
    ```mysql
    select emp_no from dept_emp where dept_no in (select dept_no from dept_emp group by dept_no having count(dept_no)>2);
    
    +----+-------------+----------+------------+-------+-----------------+---------+---------+------+--------+----------+--------------------------+
    | id | select_type | table    | partitions | type  | possible_keys   | key     | key_len | ref  | rows   | filtered | Extra                    |
    +----+-------------+----------+------------+-------+-----------------+---------+---------+------+--------+----------+--------------------------+
    |  1 | PRIMARY     | dept_emp | NULL       | index | NULL            | dept_no | 4       | NULL | 331570 |   100.00 | Using where; Using index |
    |  2 | SUBQUERY    | dept_emp | NULL       | index | PRIMARY,dept_no | dept_no | 4       | NULL | 331570 |   100.00 | Using index              |
    +----+-------------+----------+------------+-------+-----------------+---------+---------+------+--------+----------+--------------------------+
    2 rows in set, 1 warning (0.00 sec)```
2.List the no. of employees in each department where the no. is less than 4.
    
    mysql
    select count(*) from dept_emp group by dept_no having count(dept_no) < 4;
    
    +----+-------------+----------+------------+-------+-----------------+---------+---------+------+--------+----------+-------------+
    | id | select_type | table    | partitions | type  | possible_keys   | key     | key_len | ref  | rows   | filtered | Extra       |
    +----+-------------+----------+------------+-------+-----------------+---------+---------+------+--------+----------+-------------+
    |  1 | SIMPLE      | dept_emp | NULL       | index | PRIMARY,dept_no | dept_no | 4       | NULL | 331570 |   100.00 | Using index |
    +----+-------------+----------+------------+-------+-----------------+---------+---------+------+--------+----------+-------------+
    1 row in set, 1 warning (0.00 sec)
        
3. List the deparment name, number of employees and max salary of each department.
    ```aidl
    mysql> explain select d.dept_name,count(de.emp_no),max(s.salary) from departments as d,dept_emp as de,salaries as s where de.emp_no = s.emp_no and de.dept_no = d.dept_no group by de.dept_no;
    +----+-------------+-------+------------+--------+-----------------+---------+---------+----------------------+--------+----------+-------------+
    | id | select_type | table | partitions | type   | possible_keys   | key     | key_len | ref                  | rows   | filtered | Extra       |
    +----+-------------+-------+------------+--------+-----------------+---------+---------+----------------------+--------+----------+-------------+
    |  1 | SIMPLE      | de    | NULL       | index  | PRIMARY,dept_no | dept_no | 4       | NULL                 | 331570 |   100.00 | Using index |
    |  1 | SIMPLE      | d     | NULL       | eq_ref | PRIMARY         | PRIMARY | 4       | employees.de.dept_no |      1 |   100.00 | NULL        |
    |  1 | SIMPLE      | s     | NULL       | ref    | PRIMARY         | PRIMARY | 4       | employees.de.emp_no  |      9 |   100.00 | NULL        |
    +----+-------------+-------+------------+--------+-----------------+---------+---------+----------------------+--------+----------+-------------+
    3 rows in set, 1 warning (0.00 sec)
   ```
4. List the no. of employees and average salary within each department for each job name.
   ```
   mysql> explain select count(*),avg(salary) from salaries as S,dept_emp as DEMP,titles as T where DEMP.emp_no=S.emp_no AND DEMP.emp_no=T.emp_no group by T.title,DEMP.dept_no;
   +----+-------------+-------+------------+-------+---------------+---------+---------+-----------------------+--------+----------+----------------------------------------------+
   | id | select_type | table | partitions | type  | possible_keys | key     | key_len | ref                   | rows   | filtered | Extra                                        |
   +----+-------------+-------+------------+-------+---------------+---------+---------+-----------------------+--------+----------+----------------------------------------------+
   |  1 | SIMPLE      | DEMP  | NULL       | index | PRIMARY       | dept_no | 4       | NULL                  | 331570 |   100.00 | Using index; Using temporary; Using filesort |
   |  1 | SIMPLE      | T     | NULL       | ref   | PRIMARY       | PRIMARY | 4       | employees.DEMP.emp_no |      1 |   100.00 | Using index                                  |
   |  1 | SIMPLE      | S     | NULL       | ref   | PRIMARY       | PRIMARY | 4       | employees.DEMP.emp_no |      9 |   100.00 | NULL                                         |
   +----+-------------+-------+------------+-------+---------------+---------+---------+-----------------------+--------+----------+----------------------------------------------+
   3 rows in set, 1 warning (0.00 sec)
   ```
5. Check the all the employee numbers are unique ?
    ```aidl
   mysql> explain select count(distinct(emp_no)) from employees;
   +----+-------------+-----------+------------+-------+---------------+---------+---------+------+--------+----------+-------------+
   | id | select_type | table     | partitions | type  | possible_keys | key     | key_len | ref  | rows   | filtered | Extra       |
   +----+-------------+-----------+------------+-------+---------------+---------+---------+------+--------+----------+-------------+
   |  1 | SIMPLE      | employees | NULL       | index | PRIMARY       | PRIMARY | 4       | NULL | 299335 |   100.00 | Using index |
   +----+-------------+-----------+------------+-------+---------------+---------+---------+------+--------+----------+-------------+
   1 row in set, 1 warning (0.00 sec)
   ```
6. List the name of departments where atleast 2 employees are working in that department.
   ```aidl
   mysql> explain select     d.dept_name from departments d, employees e, dept_emp de where     e.emp_no = de.emp_no and d.dept_no = de.dept_no group by      d.dept_name having count(*) >=2;
   +----+-------------+-------+------------+--------+-------------------+-----------+---------+---------------------+-------+----------+-------------+
   | id | select_type | table | partitions | type   | possible_keys     | key       | key_len | ref                 | rows  | filtered | Extra       |
   +----+-------------+-------+------------+--------+-------------------+-----------+---------+---------------------+-------+----------+-------------+
   |  1 | SIMPLE      | d     | NULL       | index  | PRIMARY,dept_name | dept_name | 42      | NULL                |     9 |   100.00 | Using index |
   |  1 | SIMPLE      | de    | NULL       | ref    | PRIMARY,dept_no   | dept_no   | 4       | employees.d.dept_no | 41446 |   100.00 | Using index |
   |  1 | SIMPLE      | e     | NULL       | eq_ref | PRIMARY           | PRIMARY   | 4       | employees.de.emp_no |     1 |   100.00 | Using index |
   +----+-------------+-------+------------+--------+-------------------+-----------+---------+---------------------+-------+----------+-------------+
   3 rows in set, 1 warning (0.00 sec)
   ```