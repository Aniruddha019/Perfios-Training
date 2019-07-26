# Description: The comm Command

### Notes
* The comm command compares two sorted files line by line.
* Suppose you have two lists of people and you are asked to find out the names available   
in one and not in the other, or even those common to both.   
comm is the command that will help you to achieve this. 
* With no option, the comm command produces three-column output.
    - Column one contains lines unique to FILE1.
    - Column two contains lines unique to FILE2.
    - Column three contains lines common to both the files - FILE1 and FILE2.
    


### Common Examples
```shell  
comm file_1 file_2                          # Compare two sorted files line by line.
comm -1 file_a file_b                       # Suppress lines unique to file_a
comm -2 file_a file_b                       # Suppress lines unique to file_b
comm -3 file_a file_b                       # Suppress lines that appear in both files
```