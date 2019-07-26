# SQL Queries
1. Find the details of all the employees along with their current title. 

    ```
    select 
        e.*, t.title 
    from 
        employees as e, titles as t 
    where 
        e.emp_no = t.emp_no;
    ```
    
2. Find all the current female engineers who were born before 1959, currently works in 'Development' department and 
   currently draws a salary of more than 100000. Display employee number, birth date, first name, last name, gender, 
   hire date, title, from fate from title table, to date from title table, salary, from date from salary table, to date 
   from salary table, department name, from date from dept_emp table, to date from dept_emp. Sort the result in 
   descending order of birth dates.
   
     ```
    select 
        e.emp_no,e.birth_date,e.first_name,e.last_name,e.gender,e.hire_date,
        t.title,t.from_date,t.to_date,
        s.salary,s.from_date,s.to_date,
        d.dept_name,de.from_date 
    from 
       employees as e, 
       titles as t, 
       departments as d, 
       salaries as s, 
       dept_emp as de 
    where 
       e.emp_no = t.emp_no and 
       t.title = "Engineer" and 
       e.gender = 'F'and 
       e.emp_no = de.emp_no and 
       d.dept_no =de.dept_no and 
       d.dept_name = "Development" and 
       e.emp_no = s.emp_no and 
       s.salary > 100000 and
       e.birth_date >= '1959-01-01' and 
       e.birth_date <= '1959-12-31' and
       curdate() < de.to_date and 
       curdate() < s.to_date
    order by 
       e.birth_date desc;
    
     ```
3. Display employee number, first name, last name and department name of all the employees who are working in the 
   'Development' department. Use a left join to write this query.
     ```
    select 
        e.emp_no, e.first_name, e.last_name, d.dept_name 
    from 
        employees as e left join 
            (dept_emp as de left join departments as d on d.dept_no = de.dept_no) 
        on e.emp_no = de.emp_no 
    where 
        d.dept_name = "Development";
    ```
4. Find employee number, first name, last name and department name of all the employees who are working under the 
   manager 110039. Use a left join between different tables.
     ```
     select
         e.emp_no, e.first_name, e.last_name, d.dept_name
     from
         dept_manager dm
         left join departments d on d.dept_no = dm.dept_no
         left join dept_emp de on de.dept_no =  d.dept_no
         left join employees e on de.emp_no = e.emp_no
     where
         dm.emp_no = 110039 and
         curdate() < dm.to_date and
         curdate() < de.to_date;
    
    ```
5. Find the various job titles held by employees with employee number 69434 or 470681 or 449029 or 411165 during their 
   entire tenure. Display the columns employee numbers, first name, last name, title, from date and to date. Sort the 
   result in the ascending order of the period of each title. Use a left join between employees and titles table.
    ```
    select
        e.emp_no, e.first_name, e.last_name, t.title, t.from_date, t.to_date
    from
        employees e
        left join titles t on e.emp_no = t.emp_no
    where
        e.emp_no in (69434, 470681, 449029, 411165)
    order by
        datediff(curdate(),t.from_date);
    
    ```