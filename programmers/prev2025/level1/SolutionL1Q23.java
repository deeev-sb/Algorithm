package prev2025.level1;// 하샤드 수

class SolutionL1Q23 {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = (String.valueOf(x)).split("");
        int xsum = 0;
        for (int i = 0; i < arr.length; i++)
            xsum += Integer.valueOf(arr[i]);
        if (x%xsum != 0)
            answer = false;
        return answer;
    }
}