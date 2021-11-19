# 부족한 금액 계산하기 
def solution(price, money, count):
    answer = 0
    
    need = 0
    for i in range(1, count + 1) :
        need += price*i
    
    answer = need - money
    if answer < 0 :
        answer = 0

    return answer