if __name__ == '__main__':
    input()
    set1 = set(map(int, input().split(' ')))
    input()
    set2 = set(map(int, input().split(' ')))
    print(len(set1.union(set2)))
