# 1로 만들기

n = int(input())

dp = [0, 0, 1, 1] # 0, 1, 2, 3번 인덱스까지 값을 넣어둠

for i in range(4, n+1) :
    if i%3 == 0 and dp[i-1] > dp[i//3]:
        dp.append(dp[i//3]+1)
    elif i%2 == 0 and dp[i-1] > dp[i//2]:
        dp.append(dp[i//2]+1)
    else :
        dp.append(dp[i-1]+1)

print(dp[n])