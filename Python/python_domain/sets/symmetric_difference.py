def solution(set1, set2):
    res = list(set1.union(set2).difference(set1.intersection(set2)))
    res = sorted(res)
    print('\n'.join(map(str, res)))


if __name__ == '__main__':
    m = input()
    set1 = set(map(int, input().split(' ')))
    n = input()
    set2 = set(map(int, input().split(' ')))
    solution(set1, set2)
