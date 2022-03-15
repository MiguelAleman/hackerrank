def swap_case(s):
    return str(''.join([c.lower() if c == c.upper() else c.upper() for c in s]))


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
