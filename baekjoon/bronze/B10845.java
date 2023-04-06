package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 큐
public class B10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()); // 명령어 수

        Queue<Integer> queue = new LinkedList<>();

        String command = "";
        StringTokenizer st = null;
        int lastNum = 0;

        for (int i = 0; i < cnt; i++) {
            command = br.readLine();
            st = new StringTokenizer(command);

            switch(st.nextToken()) {
                case "push" :
                    lastNum = Integer.parseInt(st.nextToken());
                    queue.add(lastNum);
                    break;
                case "pop" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "back" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(lastNum);
                    }
                    break;

            }
        }

    }

}
