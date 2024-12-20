package codility;

// Lesson 5 > Prefix Sums > PassingCars
// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
public class PassingCars {
    public int solution(int[] A) {
        int countP = 0;
        int answer = 0;
        for (int num : A) {
            // 동쪽
            if (num == 0){
                countP++;
            } else { // 서쪽
                answer = answer + countP;
                if (answer > 1000000000) return -1;
            }
        }

        return answer;
    }
}