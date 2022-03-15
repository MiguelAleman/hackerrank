def print_formatted(number):
    width = None
    lines = []
    for i in range(number, 0, -1):
        octal = str(oct(i))[2:]
        hexadecimal = str(hex(i))[2:].upper()
        binary = str(bin(i))[2:]
        if width is None:
            width = len(binary)
        res = [str(i), octal, hexadecimal, binary]
        lines.append(' '.join([x.rjust(width) for x in res]))
    print('\n'.join(lines[::-1]))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
