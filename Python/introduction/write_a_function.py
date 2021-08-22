def is_leap(year):
    leap = False

    # Write your logic here
    if year % 4 == 0:
        if not (year % 100 == 0 and year % 400 != 0):
            leap = True

    return leap


if __name__ == '__main__':
    year = int(input())
    print(is_leap(year))
