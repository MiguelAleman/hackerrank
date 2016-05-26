#!/bin/bash

read ans
if [[ "$ans" = "y" ]] || [[ "$ans" = "Y" ]]; then
    echo "YES"
else
    echo "NO"
fi
