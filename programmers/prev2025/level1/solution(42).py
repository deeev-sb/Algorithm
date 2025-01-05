# 2021 KAKAO BLIND RECRUITMENT 신규 아이디 추천


def text_check(text) : # 2번 문자 규칙 확인 함수
    if text.islower() or text.isdigit() or text in '-_.' :
        return text
    return ''

def delete_dot(text) : # 3번 연속인 점 제거
    check = False
    answer = ''
    for t in text :
        if t == '.' :
            if not check :
                check = True
                answer += t
        else :
            check = False
            answer += t
    return answer

def fl_dot(text) : # 4번 처음과 끝에 위치한 점 제거
    if text[0] == '.' :
        text = text[1:]
    if len(text) <= 0 : return ''
    if text[-1] == '.' :
        text = text[:len(text)-1]
    return text

def add_text(text) : # 7번 규칙. 길이가 3이 될 때까지
    while len(text) != 3 :
        text += text[-1]
    return text

def solution(new_id):
    
    # 1. 소문자로 치환
    new_id = new_id.lower()
    
    # 2. 정해진 문자 외의 모든 문자 제거
    new_id = ''.join(list(map(text_check, new_id)))
    # new_id = re.sub('[^a-z0-9._-]', '', new_id) 
    
    # 3. .이 2번 이상 연속된 경우 1개로 치환
    new_id = delete_dot(new_id)
    
    # 4. .이 처음이나 끝에 위치하면 제거
    new_id = fl_dot(new_id)
    
    # 5. 빈 문자열이라면, "a" 대입
    if len(new_id) == 0 :
        new_id = "a"
    
    # 6. 길이가 16자 이상이면, 처음 15개 제외하고 모두 제거 후 4번 적용
    if len(new_id) >= 16 :
        new_id = fl_dot(new_id[:15])
    
    # 7. 길이가 2 이하라면, 3이 될 때까지 마지막 문자를 끝에 붙임
    if len(new_id) <=2 :
        new_id = add_text(new_id)

    return new_id