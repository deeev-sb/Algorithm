package Baekjoon.Silver;

import java.util.Scanner;

/**
 * 카드 구매하기 2
 * 카드 N개를 갖기 위해 지불해야 하는 금액의 최솟값
 * 4개 카드
 * 1 5 6 7 <- 장 당 가격
 * 1장짜리는 4개 사면 4원!
 * ---
 * 4
 * 장 3  5  15 16
 * 1  3
 * 2  3  5
 * 3  3  5  8
 * 4  3  5  8  10
 * ---
 * 10
 * 장 5  10  11  12  13  30  35  40  45  47
 * 1  5
 * 2  5  10
 * 3  5  10  11
 * 4  5  10  11  12
 * 5  5  10  11  12  13
 * 6  5  10  11  12  13  18
 * 7
 * 8
 * 9
 * 10
 * 구하는 방식은?
 * 현재가 k라고 할 때 아래 세 가지 사항을 비교하여 구하기
 * K / 2 에 대한 모든 가격을 체크하면서 진행
 */
public class B16194 {
    public static int solution(int want, int[] cardPriceList) {
        int[] cardPrices = new int[want];

        cardPrices[0] = cardPriceList[0];

        for (int i = 1; i < want; i++) {
            cardPrices[i] = cardPriceList[i];
            for (int j = 0; j <= i / 2; j++) {
                cardPrices[i] = Math.min(cardPrices[i], cardPrices[j] + cardPrices[i - j - 1]);
            }
        }

        return cardPrices[want - 1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int want = input.nextInt(); // 구매하기 원하는 카드 수
        int[] cardPriceList = new int[want];

        for (int i = 0; i < want; i++) {
            cardPriceList[i] = input.nextInt();
        }

        System.out.println(solution(want, cardPriceList));
    }
}
