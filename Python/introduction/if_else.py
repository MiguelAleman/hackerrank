#!/bin/python3

if __name__ == '__main__':
    n = int(input().strip())
    if n % 2 != 0:
        print("Weird")
    else:
        if 2 <= n <= 5 or n > 20:
            print("Not Weird")
        else:
            print("Weird")
