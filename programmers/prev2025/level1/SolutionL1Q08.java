package prev2025.level1;// 나누어 떨어지는 숫자 배열

import java.util.*; 

class SolutionL1Q08 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0)
                arrlist.add(arr[i]);
        }
        
        if (arrlist.size() == 0)
            arrlist.add(-1);
        
        int n = arrlist.size();
        answer = new int[n];
        
        for (int i = 0; i < n; i++){
            answer[i] = arrlist.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}