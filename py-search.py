#!/usr/bin/env python
import re
import os
import sys


OpenFile = open(sys.argv[1], 'r')

count = 0
for line in OpenFile:
	if "import" in line:
		print line
		count=count+1

print("Number of Imports in file %s : %d" %(OpenFile,count))