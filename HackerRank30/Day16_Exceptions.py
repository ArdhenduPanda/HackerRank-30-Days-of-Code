#!/bin/python3

import sys

S = input().strip()

def convertString(S):
    return int(S)

try:
    print(convertString(S))
except:
    print("Bad String")
