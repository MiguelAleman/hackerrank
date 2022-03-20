#
# Complete the 'gradingStudents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY grades as parameter.
#


def grading_students(grades):
    return [e if e < 38 or e % 5 <= 2 else e + (5 - e % 5) for e in grades]


if __name__ == '__main__':
    grades_count = int(input().strip())
    grades = []

    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)

    result = grading_students(grades)
    print(result)
