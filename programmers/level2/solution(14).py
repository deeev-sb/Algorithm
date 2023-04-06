# 괄호 회전하기
def solution(s):
    answer = 0
    
    slen = len(s)
    for i in range(slen) :
        s = s[1:] + s[0]
        stack = []
        for i in range(slen) :
            if len(stack) > 0:
                if (s[i] == "}" and stack[-1] == "{") or  (s[i] == "]" and stack[-1] == "[") or (s[i] == ")" and stack[-1] == "("):
                    stack.pop()
                    continue
            stack.append(s[i])
        
        if len(stack) == 0 :
            answer += 1
    
    return answer