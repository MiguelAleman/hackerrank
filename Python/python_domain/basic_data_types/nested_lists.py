def main():
    data = dict()

    for _ in range(int(input())):
        name = input()
        data[name] = float(input())

    lowest = 200
    name = []
    for k, v in data.items():
        if v < lowest:
            lowest = v
            name.clear()
            name.append(k)
        elif v == lowest:
            name.append(k)

    for n in name:
        del data[n]

    new_lowest = 200
    result = []

    for k, v in data.items():
        if v < new_lowest:
            new_lowest = v
            result.clear()
            result.append(k)
        elif v == new_lowest:
            result.append(k)

    for i in sorted(result):
        print(i)


if __name__ == '__main__':
    main()
