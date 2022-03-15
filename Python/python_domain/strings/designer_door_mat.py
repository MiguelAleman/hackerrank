# Enter your code here. Read input from STDIN. Print output to STDOUT
def main(n, m):
    lines = [('.|.' * i).center(m, '-') for i in range(1, n, 2)]
    print('\n'.join(lines + ['WELCOME'.center(m, '-')] + lines[::-1]))


if __name__ == '__main__':
    main(*[int(x) for x in input().split()])
