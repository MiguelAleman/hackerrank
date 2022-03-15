def print_rangoli(size):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    width = (size + size - 1) * 2 - 1
    lines = []
    for start in range(size):
        second = alphabet[start:size]
        first = second[::-1][:-1]
        lines.append(f"{'-'.join(first + second).center(width, '-')}")
    print('\n'.join(lines[::-1] + lines[1:]))


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
