# Description: The sort Command

### Notes
* The Unix sort command is a simple command that can be used to rearrange the contents of text files line by line.
* The command is a filter command that sorts the input text and prints the result to stdout.
* Numbers are sorted to be ahead of letters.
* Lowercase letters are sorted to be ahead of uppercase letters.
### Common Examples
```shell
sort file1.txt        # Sort with default ordering
sort -r file1.txt     # Sort in reverse ordering
sort -k 2 file1.txt   # Sort by the second field
sort -u file2.txt     # Sort suppressing repeated lines
```