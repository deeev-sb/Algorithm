# 택배 마스터 광우
import sys
from itertools import permutations

n, m, k = map(int, input().split())
rail = list(map(int, input().split()))
answer = 2147000000

for prail in list(permutations(rail, n)) :
    idx = 0
    curweight = 0
    for _ in range(k) :
        weight = 0
        while True :
            if idx == n :
                idx = 0
            if weight + prail[idx] > m :
               break
            weight += prail[idx]
            idx += 1
        curweight += weight
    answer = min(answer, curweight)

print(answer)