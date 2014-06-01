#!/bin/bash 

echo "number of days since the year's begin"

prefix=temp
suffix=$(date + %s)
filename=$prefix.$suffix
echo "filename=$filename"

exit 0
