# Description: Javascript Exercise 1

### Description

1. Write a function which iterates over an object and prints all the properties including the nested.
    ```javascript
    //script to print all properties of an object including nested
    
    var person = {
        name:"Aniruddha",
        age:22,
        address:{
            place:"Bangalore",
            pin:29
        }
    };
    
    
    var obj_properties = function(person){
        for (var x in person){
            if(typeof person[x] === "object"){
                console.log(x + " : --");
                obj_properties(person[x]);
            }
            else{
                console.log(x + " : " + person[x]);		
            }
        
        }
    }
    
    obj_properties(person);
    ```
2. Write a function to create an object from an array of key value pairs.
   > sample input: `[["key1", "val1"],["key2", "val2"]]`
   ```javascript
   //script to convert an array to object
    sample_input= [["key1", "val1"],["key2", "val2"]];
    
    var obj={};
    for(var i in sample_input){
        obj[sample_input[i][0]]=sample_input[i][1];
    }
    console.log("Print object:"+JSON.stringify(obj));
   ```
3. Write a function to extend a given object and adds new properties from array of key value pairs. 
    > sample input: `{"license": "GPL", "version":"1.0"}, [["key1", "val1"],["version", "val2"]]`
    ```javascript
   //script to extend an object from an array
    sample_input= [["key1", "val1"],["version", "val2"]];
    
    var obj={"license": "GPL", "version":"1.0"};
    for(var i in sample_input){
        obj[sample_input[i][0]]=sample_input[i][1];
    }
    console.log("Print object:"+JSON.stringify(obj));
   ```
4.  Write a function which takes number n as input and returns nth Fibonacci number. Implement it in following 2 ways.
    - using recursion
    ```javascript
    //function to print nth fibonacci number
    var fib_recursive = function(first_number,second_number,n){
        if(n==1)
        {
            return first_number+second_number;
        }
        else{
            return fib_recursive(second_number,first_number+second_number,n-1);
        }
    }
    var fib = function(number){
        return fib_recursive(0,1,number-2);
    }
    console.log(fib(5));

    ```
    - without using recursion
    ```javascript
    // script to print nth fibonacci number without recursion
    var fib_loop = function(n){
        first_number=0;
        second_number=1;
        for(var i=0;i<n-2;i++){
            var temp=second_number;
            second_number=first_number+second_number;
            first_number=temp;
        }
        return second_number;
    }
    console.log(fib_loop(6));
    ```
5. Given an array of numbers, create an array of squares of them using `map`.
    ```javascript
    //script to print squares from an array of numbers using map
    var numbers = [4, 9, 16, 25];
    
    function squares_array() {
      var x = numbers.map(function(y){
        return y*y;
      });
      return x;
    }
    
    console.log(JSON.stringify(squares_array()));
   ```
6. Given an array of numbers, create a new array with prime numbers using `filter`.
    ```javascript
    /// script to print array of only prime numbers using filter
    var numbers = [1, 2, 3, 89, 7,44];

    function checkPrime(num) {
        if(num === 2){
        return true;
        }
        if(num === 1 || num % 2 == 0){
            return false;
        }
        for(var i=2; i <= Math.sqrt(num); i++){
            if(num %i === 0){
                return false;
            }
        }
      return true;
    }
    
   console.log(JSON.stringify(numbers.filter(checkPrime)));
   ```
7. Implement stack and queue using javascript arrays.  
   **Stack**
    ```javascript
    // Script to implement stack in JS
    class Stack { 
      
        // Array is used to implement stack 
        constructor() 
        { 
            this.items = []; 
        }
        push(element) 
        { 
            // push element into the items 
            this.items.push(element); 
        }
        
        
        pop() 
        { 
            // return top most element in the stack 
            // and removes it from the stack 
            // Underflow if stack is empty 
            if (this.items.length == 0) 
                return "Underflow"; 
            return this.items.pop(); 
        }
        
        peek() 
        { 
            // return the top most element from the stack 
            // but does'nt delete it. 
            return this.items[this.items.length - 1]; 
        } 
    }
    
    var s = new Stack();
    s.push(1);
    s.push(2);
    s.push(6);
    s.push(8);
    console.log(JSON.stringify(s));
    console.log(s.peek());
    s.pop();
    console.log(JSON.stringify(s));
   ```
   **Queue**
   ```javascript
   
    class Queue { 
      
        // Array is used to implement stack 
        constructor() 
        { 
            this.items = []; 
        } 
      
        // Functions to be implemented 
        // insert(item) 
        // remove() 
        insert(element) 
        { 
            // insert element into the items at beginning
            this.items.unshift(element); 
        }
        
        
        remove() 
        { 
            // return last element in the queue 
            // and removes it from the queue 
            // Underflow if queue is empty 
            if (this.items.length == 0) 
                return "Underflow";
            var ret=this.items[this.items.length-1];
            this.items.length=this.items.length-1;
            return ret; 
        }
        
    }
    
    var s = new Queue();
    s.insert(1);
    s.insert(2);
    s.insert(3);
    s.insert(4);
    s.insert(5);
    s.insert(6);
    console.log(JSON.stringify(s));
    console.log(s.remove());
    console.log(s.remove());
    console.log(JSON.stringify(s));
    console.log(s.remove());
    s.insert(9);
    console.log(JSON.stringify(s));

   ```
