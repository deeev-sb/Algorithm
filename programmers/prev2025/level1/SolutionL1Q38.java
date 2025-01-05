package prev2025.level1;

// 소수 만들기
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numsLen = nums.length;
        for (int i = 0; i < numsLen; i++) {
            for (int j = i + 1; j < numsLen; j++) {
                for (int k = j + 1; k < numsLen; k++){
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public Boolean isPrime(int num) {
        int check = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check++;
            }
            if (check > 2) {
                return false;
            }
        }
        return check==1;
        
    }
}
