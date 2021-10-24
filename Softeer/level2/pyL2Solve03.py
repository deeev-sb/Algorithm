# 바이러스

import sys

inp = sys.stdin.readline

k, p, n = map(int, inp().split())

answer = k
for _ in range(n) :
    answer = (answer * p) % 1000000007

print(answer) 