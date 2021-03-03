# 스택 수열

n = int(input())
d = [int(input()) for _ in range(n)] # 만들어야하는 수열
stack = [1] # stack에 1이 들어가면서 시작
reslut = ['+'] # stack에 대한 기록. 1이 들어갔으며로 push 표시

def func() :
    i = 2 # stack에 저장할 숫자 위치
    cur = 0 # 수열 위치
    while cur < n :
        if i > n + 1:
            return "NO"
        if len(stack) > 0 and stack[-1] == d[cur] :
            stack.pop()
            reslut.append('-')
            cur += 1
        else :
            stack.append(i)
            reslut.append('+')
            i += 1
    return "YES"

if func() == "YES" :
    for r in reslut :
        print(r)
else :
    print("NO")