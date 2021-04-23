# 2020 카카오 인턴십 수식 최대화
from itertools import permutations

def expression_split(expression) : # 수식 분리
    ope, exp, temp = [], [], ''
    for e in expression :
        if e == '+' or e == '-' or e == '*' :
            ope.append(e)
            exp.append(int(temp))
            temp = ''
        else : temp += e
    exp.append(int(temp))
    return ope, exp

def calcuration(prior, ope, exp) :
    result = []
    for p in prior :
        idx = 0
        while True :
            if idx >= len(ope) :
                break
            if p == ope[idx] :
                if p == '*' : exp[idx] = exp[idx] * exp[idx+1]
                if p == '+' : exp[idx] = exp[idx] + exp[idx+1]
                if p == '-' : exp[idx] = exp[idx] - exp[idx+1]
                exp = exp[:idx + 1] + exp[idx+2:]
                ope = ope[:idx] + ope[idx+1:]
                idx = -1
            idx += 1
    return exp[0]

def solution(expression):
    answer = 0
    
    operation = ['+', '-', '*']
    prior = list(permutations(operation, 3))
    
    ope, exp = expression_split(expression)
    
    for p in prior :
        cope, cexp = ope[:], exp[:]
        answer = max(answer, abs(calcuration(p, cope, cexp)))
    
    
    
    return answer