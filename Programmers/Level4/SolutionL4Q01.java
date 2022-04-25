package Level4;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 호텔 방 배정
 * 호텔에는 방이 총 k개 있으며, 각각의 방은 1번부터 k번까지 번호로 구분
 * 배정 규칙정
 * 1. 한 번에 한 명씩 신청한 순서대로 배정
 * 2. 고객은 투숙하기 원하는 방 번호 제출
 * 3. 고객이 원하는 방이 비어있다면 즉시 배정
 * 4. 고객이 원하는 방이 배정되어 있으면 원하는 방보다 번호가 크면서 비어있는 방 중 가장 번호가 작은 방 배정
 * ---
 * UnioFind를 활용한 문제
 * key를 방번호, value를 부모 노드 방 번호라고 할 때,
 * 방이 비어있으면 해당 방에 대해 배정하고 난 다음 1번 방의 부모 노드를 그 다음 방인 2번 방으로 표시한다.
 * 이 때 2번 방의 부모 노드가 1으로 되어 있으면, 1번 방의 부모 노드도 3으로 변경되게 해야 한다.
 * ---
 * k	room_number	    result
 * 10	[1,3,4,1,3,1]	[1,3,4,2,5,6]
 */
public class SolutionL4Q01 {
    static HashMap<Long, Long> roomInfo = new HashMap<>();

    public static long findEmptyRoom(long wantRoom) {
        if (!roomInfo.containsKey(wantRoom)) { // 요청한 방이 비어있음
            roomInfo.put(wantRoom, wantRoom + 1); // 다음 방 연결
            return wantRoom;
        }

        long next_room = roomInfo.get(wantRoom);
        long empty_room = findEmptyRoom(next_room);
        roomInfo.put(wantRoom, empty_room);
        return empty_room;
    }

    public static long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];

        for (int i = 0; i < room_number.length; i++) {
            answer[i] = findEmptyRoom(room_number[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        long k = 10;
        long[] room_number = {1, 3, 4, 1, 3, 1};
        System.out.println(Arrays.toString(solution(k, room_number)));
    }
}
