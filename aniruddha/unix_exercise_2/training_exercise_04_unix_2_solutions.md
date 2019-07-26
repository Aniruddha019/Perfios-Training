##### Exercise 1:
 * create a directory and files file1, file2 in it.
 * create a user `testuser` and a group `testgroup`.
 * change the ownership of directory and files to the above user and group
 * make file2 executable by the current user.
 
##### Solution:
```
 * mkdir temp
 * cd temp
 * cat > file1
 * cat > file2
 * sudo useradd -m testuser
 * sudo passwd testuser
 * sudo groupadd testgroup
 * sudo chown testuser file1
 * sudo chown testuser file2
 * sudo chown :testgroup file1 file2
 * sudo chmod 764 file2
 
 ```
 
 
 
##### Execrcise 2:
  * List all the files in a directory by created date and print the file extension for last 3 files.
  
##### Solution:
 
 ```
 * ls -rt                                # lists all files in created date order
 * tail -3                               # last two files
 * sed 's/.*\.//'                        # for extracting extensions
 * ls -rt | tail -3 | sed 's/.*\.//'     # Combined using pipeline
 ```
 
 
 
##### Execrcise 3:
  * Move all the bash scripts created in the past 2 hours, from a given directory to a separate directory with name `shell_scripts`.
  
 
##### Solution:
 ```
 * mv `find source_directory -cmin -120 -type f -name '*.sh'` destination_directory     
 ```
 
##### Exercise 4
 * Given a directory path, Archive all the files in it, that contains text `PRIVATE_KEY` using tar.

##### Solution:
```
tar -cvf file.tar `find . -type f -exec grep -l PRIVATE_KEY {} +`
```



##### Exercise 5
* Given a directory path, replace the text `dir` with  `rid` in all files of the dir.

##### Solution:
```aidl
sed -i 's/dir/rid/g' `find given_directory_path -type f`
```
