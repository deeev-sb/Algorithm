# 소수찾기

n = int(input())
nums = list(map(int, input().split()))

check = [1] * 1001
check[0], check[1] = 0, 0
cnt = 0

for i in range(2, 1001) :
    if check[i] == 1:
        for j in range(i+i, 1001, i) :
            check[j] = 0

for num in nums :
    if check[num] :
        cnt += 1
print(cnt)