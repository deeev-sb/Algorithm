package codility;

// Lesson 3 > Time Complexity > FrogJmp
// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jump = (Y - X)/D;
        if (D * jump + X == Y) {
            return jump;
        } else {
            return jump + 1;
        }
    }
}
