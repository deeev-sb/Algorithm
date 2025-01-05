package prev2025.level2;// 전화번호 목록
// 한 번호가 다른 번호의 접두어인지 확인 (앞부분 확인하면 됨)
// startsWith 활용

import java.util.*;

class SolutionL2Q06 {
    public boolean solution(String[] phone_book) {
        // boolean answer = true;
        
        // 순서대로 확인하기 위해 정렬시킴
        Arrays.sort(phone_book);
        
        // 접두어가 일치하는지 확인
        for (int i = 0; i < phone_book.length - 1; i++){
            for (int j = i + 1; j < phone_book.length; j++){
                if (phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        
        return true;
    }
}