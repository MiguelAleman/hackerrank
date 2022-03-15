def main():
    n = int(input())
    arr = list(map(int, input().split()))
    x = -102
    y = -101
    for i in arr:
        if i > y:
            x = y
            y = i
        elif i > x and i != y:
            x = i
    print(x)


if __name__ == '__main__':
    main()
