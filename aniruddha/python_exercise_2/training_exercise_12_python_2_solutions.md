# Description: Python Exercise 2

### Intermediate Exercise
1. Print the word counts in a given file in python
    ```aidl
    f = open("example.txt", "r")
    print(sum((len(line.split()) for line in f)))
    ```
2. Write a function to combine 2 files and generate a 3rd file.
    ```aidl
    def combine():
        with open("file.txt","r") as f1:
            content1 = f1.read()
        with open("file1.txt","r") as f1:
            content2 = f1.read()
        with open("file2.txt","w") as f1:
            f1.write(content1)
            f1.write(content2)
    ```
3. Print sum of squares of numbers in an array.
    ```aidl
    sum_sq = lambda x: x**2
    arr = [1,2,3,4,5,6]
    sq = [sum_sq(num) for num in arr]
    print(sum(sq))
    ```

4. Print primes in first 100 Fibonacci numbers
    ```aidl
    def generateFibonacci(n):
        a, b = 0, 1
        for i in range(n):
            yield a
            a,b=b,a+b
    
    
    def isPrime(n):
        # Corner case
        if n <= 1:
            return False
    
        # Check from 2 to n-1
        for i in range(2, n):
            if n % i == 0:
                return False;
    
        return True
    fib=generateFibonacci(100)
    for i in fib:
        if(isPrime(i)):
            print(i)
    
    ```

5. Generate a random string with no digits and of length 10. 
    ```aidl
    import random
    str=""
    for i in range(10):
        str+=chr(random.randrange(97,122))
    print("String is:"+str)
    
    ```
6. Print a Triangle of stars of height 6.
    ```aidl
    def tri(n):
        for i in range(n):
            for j in range(0,n-i-1):
                print(" ",end="")
            for k in range(2*i + 1):
                print("*",end="")
            print()
            
    tri(6)
    
    ```
7. Check if a given string is a valid email in python
    ```aidl
    import re
    def isValidEmail(email):
     if len(email) > 7:
     if re.match("^.+@([?)[a-zA-Z0-9-.]+.([a-zA-Z]{2,3}|[0-9]{1,3})(]?)$", email) != None:
     return True
     return False
    if isValidEmail("my.email@gmail.com") == True :
     print "This is a valid email address"
    else:
     print "This is not a valid email address"
    
    ```
8. Use lambdas to print squares of an array of numbers
    ```aidl
    sq = lambda x:x**2
    arr = [1,2,3,4,5]
    print([sq(num) for num in arr])
    ```
9. Connect to local mysql database from python
    ```aidl
    import pymysql
    
    # Open database connection
    db = pymysql.connect("localhost","root","root","employees" )
    
    # prepare a cursor object using cursor() method
    cursor = db.cursor()
    
    # execute SQL query using execute() method.
    cursor.execute("SELECT VERSION()")
    
    # Fetch a single row using fetchone() method.
    data = cursor.fetchone()
    print ("Database version : %s " % data)
    
    # disconnect from server
    db.close()
    
    ```
10. Create a users table and add a row with your details in it.
    ```aidl
    import pymysql
    
    # Open database connection
    db = pymysql.connect("localhost","testuser","test123","TESTDB" )
    
    # prepare a cursor object using cursor() method
    cursor = db.cursor()
    
    
    cursor.execute("DROP TABLE IF EXISTS USERS")
    
    sql = """CREATE TABLE USERS (
        USER_ID CHAR(20) NOT NULL,
        FIRST_NAME VARCHAR(20),
        LAST_NAME VARCHAR(20),
        AGE INT )"""
    
    
    cursor.execute(sql)
    
    db.close()
    ```