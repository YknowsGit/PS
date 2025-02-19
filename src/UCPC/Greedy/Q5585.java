// 거스름돈
package UCPC.Greedy;

import java.util.Scanner;

public class Q5585 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();

        // 거스름 돈
        int change = 1000 - n;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        // 거스름돈 계산
        for (int i = 0; i < coins.length;  i++) {
            count += change / coins[i];  // 현재 동전으로 줄 수 있는 개수 추가
            change %= coins[i];          // 남은 거스름돈 계산
        }

        System.out.println(count);
    }
}
