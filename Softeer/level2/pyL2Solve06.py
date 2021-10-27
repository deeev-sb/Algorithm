# 지도 자동 구축
# 4(2**2) -> 9(3**2) -> 25(5**2) -> 81(9**2)
# 기본 dotsNum을 2부터 시작해서 (dotsNum + (dotsNum-1))^2 방식으로 풀면 됨
# 결국 dotsNum에 대해서 먼저 계산 후 제곱하면 됨!!

import sys

n = int(input())
dotsNum = 2

for _ in range(n) :
    dotsNum = dotsNum + (dotsNum - 1)

print(dotsNum**2)