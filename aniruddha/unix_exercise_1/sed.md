# Description: The sed Command

### Notes
* SED command in UNIX is stands for stream editor 
* It can perform lot’s of function on file like, searching, find and replace, insertion or deletion.  
* By using SED you can edit files even without opening it,  
* SED is a powerful text stream editor. Can do insertion, deletion, search and replace(substitution).
* SED command in unix supports regular expression which allows it perform complex pattern matching.


### Common Examples
```shell
sed 's/unix/linux/' geekfile.txt                                  # “s” specifies the substitution operation. The “/” are delimiters. The “unix” is the search pattern and the “linux” is the replacement string
sed 's/unix/linux/2' geekfile.txt                                 # replaces the second occurrence of the word “unix” with “linux” in a line.
sed 's/unix/linux/3g' geekfile.txt                                # replaces the third, fourth, fifth… “unix” word with “linux” word in a line.
echo "Welcome To The Geek Stuff" | sed 's/\(\b[A-Z]\)/\(\1\)/g'   # prints the first character of every word in paranthesis.
sed '3 s/unix/linux/' geekfile.txt                                # restrict the sed command to replace the string on a specific line number
```