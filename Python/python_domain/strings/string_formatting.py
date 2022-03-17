def print_formatted(number):
    """
    Using built-in functions
    """
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


def print_formatted_2(number):
    """
    Using string formatting
    """
    width = len('{:b}'.format(number))
    print(
        '\n'.join(
            [
                ' '.join(
                    [
                        '{:>{width}d}'.format(x, width=width),
                        '{:>{width}o}'.format(x, width=width),
                        '{:>{width}X}'.format(x, width=width),
                        '{:>{width}b}'.format(x, width=width),
                    ]
                )
                for x in range(1, number + 1)
            ]
        )
    )


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
    print('\n')
    print_formatted_2(n)
