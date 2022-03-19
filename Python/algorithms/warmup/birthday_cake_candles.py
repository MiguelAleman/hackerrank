#
# Complete the 'birthdayCakeCandles' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY candles as parameter.
#


def birthday_cake_candles(candles):
    tallest = -1
    count = 0
    for i in candles:
        if i > tallest:
            tallest = i
            count = 1
        elif i == tallest:
            count += 1
    return count


if __name__ == '__main__':
    candles_count = int(input().strip())
    candles = list(map(int, input().rstrip().split()))
    result = birthday_cake_candles(candles)
    print(result)
