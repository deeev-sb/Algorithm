# 숫자 문자열과 영단어
def solution(s):
    answer = ""
    numDict = {"zero" : "0", "one" : "1", "two" : "2", "three" : "3", "four" : "4", "five" : "5", "six" : "6", "seven" : "7", "eight" : "8", "nine" : "9"}
    text = ""
    for t in s : 
        if t.isdigit():
            answer += t
            continue
        text += t
        try:
            n = numDict[text]
            answer += numDict[text]
            text = ""
        except:
            continue
    return int(answer)