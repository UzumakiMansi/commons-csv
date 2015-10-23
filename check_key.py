#!/usr/bin/env python
import re
import os
import sys

for root, dirs, files in os.walk("./"):
    for file in files:
        if os.path.isfile(file):
            OpenFile = open(file, 'r')
            for line in OpenFile:
                do = re.search("[a-zA-Z0-9]{63,65}", line)
                if do:
                    print ("Found DigitalOcean security Token: %s, hence rejecting the build! \nBetter luck next time!\n" %(line))
                    sys.exit(-1)
                aws = re.search("AKI[a-zA-Z0-9]{17,18}", line)
                if aws:
                    print ("Found AWS security Token: %s, hence rejecting the build! \nBetter luck next time!\n" %(line))
                    sys.exit(-1)
        if file.endswith(".pem"):
            print file
            sys.exit(-1)