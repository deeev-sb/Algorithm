# 괄호

t = int(input()) # testcase

result = []

for _ in range(t) :
    temp = input()
    stack =[]
    for i in range(len(temp)) :
        if temp[i] =='(':
            stack.append(temp[i])
        else:
            if len(stack) == 0:
                result.append("NO")
                break
            else:
                stack.pop()
    else:
        if len(stack) :
            result.append("NO")
        else :
            result.append("YES")

for i in result :
    print(i)