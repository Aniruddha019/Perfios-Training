# Description: The crontab Command

### Notes
* The crontab is a list of commands that you want to run on a regular schedule, and also the name of the command used to manage that list.
* Crontab stands for “cron table, ” because it uses the job scheduler cron to execute tasks
* Linux Crontab Format
  
  >MIN HOUR DOM MON DOW CMD
  
  |Field    |Description    |Allowed Value|
  |---------|---------------|-------------:|
  |MIN      |Minute field    |0 to 59      |
  |HOUR     |Hour field      |0 to 23      |
  |DOM      |Day of Month    |1-31         |
  |MON      |Month field     |1-12         |
  |DOW      |Day Of Week     |0-6          |
  |CMD      |Command         |Any command  |
### Common Examples
```shell
30 08 10 06 * /home/aniruddha/full-backup                 # Scheduling a Job For a Specific Time
* * * * * CMD                                             # To schedule a job for every minute using Cron
00 11, 16 * * * /home/aniruddha/bin/incremental-backup    # schedule a job for more than one time (e.g. Twice a Day)
00 09-18 * * * /home/aniruddha/bin/check-db-status        # schedule a job for certain range of time (e.g. Only on Weekdays)
```