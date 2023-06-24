package doit;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
BOJ 11003. 최솟값 찾기
N개의 수(A0 ~ Ai)와 L이 주어지고 Di = Ai-L+1 ~ Ai 중 최솟값이라고 할 때,
D에 저장된 수를 출력하라.
 */
public class Ch03P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeN = Integer.parseInt(st.nextToken());
        int sizeL = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> deque = new ArrayDeque<>(); // 구간 내 최솟값 가능성이 있는 숫자 모음

        for (int i = 0; i < sizeN; i++) {
            int number = Integer.parseInt(st.nextToken());

            // 새로운 값이 들어오기 전, 범위 내에 새로운 값보다 큰 값은 제거 (새로운 값보다 작아서 최솟값 가능성이 낮기 때문)
            while (!deque.isEmpty() && deque.getLast().value > number) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, number));

            // 범위에서 벗어난 값 제거
            if (deque.getFirst().index == i - sizeL) {
                deque.removeFirst();
            }

            bw.write(deque.getFirst().value + " ");
        }

        bw.flush();
        bw.close();

    }

    static class Node {
        int index;
        int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
