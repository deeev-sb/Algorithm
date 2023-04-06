# GBC
import sys

inp = sys.stdin.readline

n, m = map(int, inp().split())
nlist = []
mlist = []
answer = 0

for _ in range(n) :
    len, speed = map(int, inp().split())
    nlist += [speed]*len

for _ in range(m) :
    len, speed = map(int, inp().split())
    mlist += [speed]*len

for origin, test in zip(nlist, mlist) :
    answer = max(answer, test - origin)

print(answer)