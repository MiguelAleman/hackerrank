# import math
# import os
# import random
# import re
# import sys
import copy

#
# Complete the 'taskScheduling' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER d
#  2. INTEGER m


"""
Input:
5
2 2
1 1
4 3
10 1
2 1
Output:
0
1
2
2
3

Input:
6
47 778
20 794
32 387
157 650
158 363
20 691
Output:
731
1525
1912
2452
2814
3505
"""

TASKS = dict()
TOTAL_TIMELINE = 0


def task_scheduling_v1(d, m):
    # add new tasks to global variable
    TASKS[len(TASKS)] = [d, m]
    tasks_copy = copy.deepcopy(TASKS)

    global TOTAL_TIMELINE
    TOTAL_TIMELINE = TOTAL_TIMELINE + m

    timeline = 0
    max_overshoot = -1
    while timeline < TOTAL_TIMELINE:

        task_to_execute = None
        past_deadline = None
        prev_past_deadline = None

        # find task to execute
        for k, v in tasks_copy.items():
            current_past_deadline = v[1] + timeline - v[0]

            if task_to_execute is None or current_past_deadline > past_deadline:
                task_to_execute = k
                prev_past_deadline = past_deadline
                past_deadline = current_past_deadline

            elif prev_past_deadline is None or prev_past_deadline < current_past_deadline:
                prev_past_deadline = current_past_deadline

        # find segments from task to execute
        current_m = tasks_copy[task_to_execute][1]
        if prev_past_deadline is None:
            segment = current_m
        else:
            segment = min(current_m, max(1, int((past_deadline - prev_past_deadline) / 2)))

        new_m = current_m - segment
        if new_m == 0:
            if past_deadline > max_overshoot:
                max_overshoot = past_deadline
            del tasks_copy[task_to_execute]
        else:
            tasks_copy[task_to_execute][1] = new_m

        timeline = timeline + segment
    return max_overshoot


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')
    t = int(input().strip())
    for t_itr in range(t):
        first_multiple_input = input().rstrip().split()
        d = int(first_multiple_input[0])
        m = int(first_multiple_input[1])
        result = task_scheduling_v1(d, m)
        print(str(result) + '\n')
        # fptr.write(str(result) + '\n')
    # fptr.close()
