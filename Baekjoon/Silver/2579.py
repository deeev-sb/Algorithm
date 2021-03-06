# 계단 오르기
import sys
input = sys.stdin.readline

n = int(input())
steps = [int(input()) for _ in range(n)]


if n == 1 :
    print(steps[0])
elif n == 2 :
    print(steps[0] + steps[1])
elif n == 3 :
    print(max(steps[0] + steps[2], steps[1] + steps[2]))
else :
    dp = [0] * n
    dp[0], dp[1], dp[2] =  steps[0], steps[0] + steps[1], max(steps[0] + steps[2], steps[1] + steps[2])
    for i in range (3, n) :
        dp[i] = max(steps[i] + steps[i-1] + dp[i-3], steps[i] + dp[i-2])

    print(dp[n-1])