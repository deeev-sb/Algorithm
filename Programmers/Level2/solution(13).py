# 짝지어 제거하기

def solution(s):
    answer = 1
    
    stack = []
    for c in s :
        if len(stack) > 0 and stack[-1] == c:
            stack.pop()
            continue
        stack.append(c)
        
    if stack :
        answer = 0
    return answer