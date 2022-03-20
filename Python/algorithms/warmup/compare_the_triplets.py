#
# Complete the 'compareTriplets' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER_ARRAY b
#


def compare_triplets(a, b):
    alice = 0
    bob = 0
    for x in range(len(a)):
        if a[x] > b[x]:
            alice += 1
        elif b[x] > a[x]:
            bob += 1
    return [alice, bob]


if __name__ == '__main__':
    a = list(map(int, input().rstrip().split()))
    b = list(map(int, input().rstrip().split()))
    result = compare_triplets(a, b)
    print(' '.join([str(r) for r in result]))
