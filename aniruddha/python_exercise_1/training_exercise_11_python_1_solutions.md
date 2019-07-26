# Description: Python Exercise 1

### Description
1. Split a given string by `:` and create a list.
   ```aidl
   def split_string(str):
       print(str.split(':'))
   ```

2. Print the count of number characters, non-number characters in a given string.
   ```aidl
   def count(str):   
       alphabets = [char for char in str if char.isalpha()]
       digits = [char for char in str if char.isdigit()]
       print("Alphabets = " + len(alphabets))
       print("Digits = " + len(digits))
   ```

3. Stitch all the items in an array with a comma and print
   ```
   def stich(list):
        print(','.join(list))
   ```

4. Split a given string by ':' and print in reverse order
   ```aidl
   def reverse(str):
       print(str[::-1]
   ```

5. Print squares of numbers between 100 to 110
   ```aidl
   def squares():
       print([number ** 2 for number in range(100,111)])
   ```

6. Given a list of fruits and another list with their taste, create a dictionary of fruit and their taste.
   ```aidl
   def dictionary(fruits,taste):
          d=dict() 
          for i in range(len(fruits)):
              d[fruits[i]]=taste[i]
          print(d)
   ```

7. In the above problem, create a dictionary with taste as key.
    ```aidl
       def dictionary(fruits,taste):
              d=dict() 
              for i in range(len(fruits)):
                  d[taste[i]]=fruits[i]
              print(d)
    ``` 

8. Convert an array of 9 elements to array of 3 tuples where each tuple size is 3.
    ```aidl
    def arr_to_tuple(arr):
        arr=[tuple([arr[3*i+j] for j in range(0,3)]) for i in range(0,3)]
        print(arr)
    ``` 

9. Convert a tuple of 9 elements to an array of 3 tuples where each tuple size is 3.
    ```aidl
    def tuple_to_tuple(arr):
        arr=[tuple([arr[3*i+j] for j in range(0,3)]) for i in range(0,3)]
        print(arr)
    ```
10. Add all elements of a tuple to an existing array.
    ```aidl
    tup=(1,2,3,4,5,6,7,8,9)
    arr=[1,2,3]
    [arr.append(i) for i in tup]
    print(arr)
    ```
11. Given an array of numbers, filter the numbers divisible by 3.
    ```aidl
    def filter(arr_of_numbers):
        filtered = []
        for num in arr_of_numbers:
            n = num
            sum = 0
            while(n > 0):
                temp = n % 10
                sum += temp
                n = n // 10
            if sum % 3 is 0:
                filtered.append(num)
        print(filtered[:])
    ```    
12. Print a random integer between square root of 15 and square of 55.
    ```aidl
    import math
    import random
    
    print(random.uniform(math.sqrt(15),math.sqrt(55)))
    ```

13. Write a function to return factorial of n.
    ```aidl
    def factorial(n):
        if n is 0:
            return 1
        elif n is 1:
            return 1
        else:
            return n * factorial(n-1)
    ```