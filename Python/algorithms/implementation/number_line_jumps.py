#
# Complete the 'kangaroo' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. INTEGER x1
#  2. INTEGER v1
#  3. INTEGER x2
#  4. INTEGER v2
#


# res = x1 + v1 * c1
# res = x2 + v2 * c2


def kangaroo_v1(x1, v1, x2, v2):
    """
    Too slow
    """
    previous_distance = abs(x1 - x2)
    while True:
        x1 = x1 + v1
        x2 = x2 + v2
        if x1 - x2 == 0:
            return 'YES'
        if abs(x1 - x2) > previous_distance:
            return 'NO'
        previous_distance = abs(x1 - x2)


def kangaroo_v2(x1, v1, x2, v2):
    return 'YES'


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')
    first_multiple_input = input().rstrip().split()
    x1, v1, x2, v2 = tuple(map(int, first_multiple_input))
    result = kangaroo_v2(x1, v1, x2, v2)
    print(result)
    # fptr.write(result + '\n')
    # fptr.close()
