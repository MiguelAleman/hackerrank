"""
Input:
ABCDCDC
CDC
"""


def count_substring(string, sub_string):
    _count = 0
    for i in range(len(string)):
        if i + len(sub_string) <= len(string) \
                and string[i:i + len(sub_string)] == sub_string:
            _count = _count + 1
    return _count


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    count = count_substring(string, sub_string)
    print(count)
