def solve(s):
    prev = ' '
    res = []
    for c in s:
        if prev == ' ':
            res.append(c.upper())
        else:
            res.append(c)
        prev = c
    return ''.join(res)


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')
    s = input()
    result = solve(s)
    print(result)
    # fptr.write(result + '\n')
    # fptr.close()
