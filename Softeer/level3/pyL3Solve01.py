# 성적 평균
import sys

n, k = map(int, input().split())
sList = list(map(int, input().split()))
sectionList = [list(map(int, input().split())) for _ in range(k)]

for section in sectionList :
    start = section[0] - 1
    end = section[1]
    sums = 0
    cnt = end - start
    for i in range(start, end) :
        sums += sList[i]
    print("{:.2f}".format(sums / cnt))