# Description: The nice Command

### Notes
* nice command is used to start a process with specified nice value.
* if started the bash shell normally, it will produce lag but it can be avoided  
by starting the bash shell with high priority.
* It’s value ranges from -20(lowest) to 20(highest).


### Common Examples
```shell
nice -n -5 top   #  the top command which is running on bash shell has nice value set to -5
```