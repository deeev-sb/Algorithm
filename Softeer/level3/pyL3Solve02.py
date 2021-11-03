# 우물 안 개구리

import sys

n, m = map(int, input().split())
weights = list(map(int, input().split()))
relations = [[] for _ in range(n)]
answer = 0
for _ in range(m) :
    a, b = map(int, input().split())
    relations[a-1].append(b-1)
    relations[b-1].append(a-1)

for i in range(n) :
    relation = relations[i];
    if len(relation) == 0 :
        answer += 1
        continue;
    for r in relation :
        if weights[i] <= weights[r] :
            break
    else :
        answer += 1

print(answer)