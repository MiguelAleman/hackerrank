#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#


def mini_max_sum(arr):
    min_v, max_v = min(arr), max(arr)
    min_r, max_r = False, False
    min_t, max_t = 0, 0

    for e in arr:
        # handle min total
        if e == max_v and not max_r:
            max_r = True
        else:
            min_t += e

        # handle max total
        if e == min_v and not min_r:
            min_r = True
        else:
            max_t += e
    print(f'{min_t} {max_t}')


if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))
    mini_max_sum(arr)
