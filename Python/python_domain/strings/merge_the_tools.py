def merge_the_tools(string, k):
    current = []
    for i in range(len(string)):

        letter = string[i]

        present = False

        for j in range(len(current)):
            if letter == current[j]:
                present = True
                break

        if not present:
            current.append(string[i])

        if (i + 1) % k == 0:
            print(''.join(current))
            current.clear()


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
