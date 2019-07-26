# Description: VIM Exercise


##### Export all data from the employees table using the MySQL load data command into the file training_exercise_10_vim.csv.

SHOW VARIABLES LIKE "secure_file_priv";

    +------------------+-----------------------+
    | Variable_name    | Value                 |
    +------------------+-----------------------+
    | secure_file_priv | /var/lib/mysql-files/ |
    +------------------+-----------------------+

```select * 
from employees 
into OUTFILE '/var/lib/mysql-files/sql.csv';

> sudo cp /var/lib/mysql-files/sql.csv /home/<USERNAME>/Documents/

> sudo chmod 777  /home/<USERNAME>/Documents/sql.csv
```

##### Use VIM regular expression substitutions to convert the exported data to SQL insert statements.
  Sol 1:
  ```aidl
  :%s/\s\+/,/g|:%s/$/\)/g|%s/^/insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date) values \(/
  ```
  
  Sol 2:
  ```aidl
  :%s/\(\S*\) *\(\S*\) *\(\S*\) *\(\S*\) *\(\S*\) *\(\S*\) */insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date) values \(\1,\2,"\3","\4","\5",\6\)/
  ```