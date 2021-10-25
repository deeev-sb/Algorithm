# 8단 변속기

import sys

inp = sys.stdin.readline

nums = list(map(int, inp().split()))
answer = ""

numsSort = sorted(nums)
numsSortReverse = sorted(nums, reverse=True)

if (nums == numsSort) : answer = "ascending"
elif (nums == numsSortReverse) : answer = "descending"
else : answer = "mixed"

print(answer)