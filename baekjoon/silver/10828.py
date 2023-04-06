# 스택
import sys

n = int(input())

stack = []
result = []
for _ in range(n):
    order = sys.stdin.readline().rstrip().split() # 입력값을 input으로 받으면 시간초과
    if order[0] == "push" :
        stack.append(order[1])
    elif order[0] == "pop" :
        if len(stack) == 0 :
            result.append(-1)
        else :
            result.append(stack.pop())
    elif order[0] == "size" :
        result.append(len(stack))
    elif order[0] == "empty" :
        if len(stack) == 0 :
            result.append(1)
        else :
            result.append(0)
    elif order[0] == "top" :
        if len(stack) == 0 :
            result.append(-1)
        else :
            result.append(stack[-1])

for i in result :
    print(i)