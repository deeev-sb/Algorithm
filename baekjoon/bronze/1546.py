# 평균

n = int(input())
scores = list(map(int, input().split()))
m = max(scores)
result = 0

for score in scores :
    result += score / m * 100

print(result/n)