# 피보나치 함수

dp = [[0, 0] for _ in range(41)]

dp[0] = [1, 0]
dp[1] = [0, 1]

for i in range(2, 41): # 0, 1 사용 횟수 기록
    dp[i] = [dp[i-1][0] + dp[i-2][0], dp[i-1][1] + dp[i-2][1]]

t = int(input()) # testcase
results = []
for _ in range(t):
    n = int(input())
    results.append(str(dp[n][0]) + ' ' +  str(dp[n][1]))

for result in results:
    print(result)