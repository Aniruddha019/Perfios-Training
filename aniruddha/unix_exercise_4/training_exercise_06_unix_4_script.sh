#!/usr/bin/env bash

echo "I am Aniruddha"

#list of all files in variable files
show_files () {
  ls -l
}

# Counting the number of lines in a file
count_lines () {
  local f=$1  # 1st argument is filename
  l=`wc -l $f | sed 's/^\([0-9]*\).*$/\1/'` # find the number of lines
}

#Function to show the date
show_date() {
Year=`date +%Y`
Month=`date +%m`
Day=`date +%d`
Hour=`date +%H`
Minute=`date +%M`
Second=`date +%S`
echo `date`
echo "Current Date is: $Day-$Month-$Year"
echo "Current Time is: $Hour:$Minute:$Second"
}

#Just to find area of rectangle
area_rect(){
area=$(($1 * $2))
echo "Area is : $area"
}
