# Description: Unix Exercise 3

### Exercise 1
* Given a string containing 3 words, Print the words in the order 2 1 3.

### Solution
```
echo string_with_three_words | awk '{ print $2" "$1" " $3 }' 
```

### Exercise 2
* Given a file with the names, print the unique names in alphabetical order
### Solution
```
sort given_filename | uniq
```

### Exercise 3
* Given a shell script, output a file with all the comments.
### Solution

```
grep '^\#.*$' given_shell_script
```

### Exercise 4
* Write a shell script to generate and execute another shell script which prints a random number between 1 to 10.
### Solution

```
#File Name: shell1.sh

echo $(( $RANDOM%10 + 1))
```

```
#File Name: shell2.sh

sh shell1.sh
```
### Exercise 5
* Given a directory path, list the file count by permission level read, write, executable.
### Solution
```
* find . -executable  -print | wc -l      # where . stands for current directory
* find . -readable  -print | wc -l
* find . -writable  -print | wc -l
```

### Exercise 6
* Print the 3 most frequent words in a dir of files.
### Solution
```
cat directory_path/* | sed -e 's/\s/\n/g' | sort | uniq -c | sort -nr | head  -3
```

### Exercise 7
* Capitalize the odd number lines in a given file
### Solution
```
sed '1~2 s/\(.\)/\u\1/g' given_file > output_file
```

### Exercise 8
* Given a file, count the no of lines where the first word and last word of the line are same.
