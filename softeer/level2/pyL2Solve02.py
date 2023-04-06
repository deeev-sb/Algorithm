# 금고털이
import sys

inp = sys.stdin.readline
answer = 0

w, n = map(int, inp().split())
metalList = [list(map(int, inp().split())) for _ in range(n)]

metalList = sorted(metalList, key=lambda x : x[1], reverse=True)

for i in range(n) :
    if (w < 0) :
        break
    curWeight = metalList[i][0]
    curPrice = metalList[i][1]
    if w > curWeight :
        answer += curWeight * curPrice
    else :
        answer += w * curPrice
    w -= curWeight
        

print(answer)