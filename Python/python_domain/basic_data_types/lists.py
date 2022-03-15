"""
Input:

12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print
"""


def main():
    N = int(input())
    my_list = []
    for i in range(N):
        line = input().split(' ')
        if line[0] == 'print':
            print(my_list)
        else:
            func = getattr(my_list, line[0])
            func(*[int(l) for l in line[1:]]) if len(line) > 1 else func()


if __name__ == '__main__':
    main()
