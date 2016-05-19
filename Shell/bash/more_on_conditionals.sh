#!/bin/bash

read in1
read in2
read in3
if [[ $in1 == $in2 && $in2 == $in3 ]]; then
	echo "EQUILATERAL"
elif [[ $in1 != $in2 && $in2 != $in3 && $in1 != $in3 ]]; then
	echo "SCALENE"
else
	echo "ISOSCELES"
fi