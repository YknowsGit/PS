// 계단 오르기
package Grade2_winter.DP.Type.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n+1];
        int[][] dp = new int[n+1][3];

        for (int i = 1; i <= n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if(n == 1) { // 예외 처리
            System.out.println(score[1]);
            return;
        }

        dp[1][1] = score[1];
        dp[1][2] = 0;
        dp[2][1] = score[2];
        dp[2][2] = score[1] + score[2];

        for (int i = 3; i <= n; i++) {
            dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2]) + score[i];
            dp[i][2] = dp[i-1][1] + score[i];
        }

        System.out.println(Math.max(dp[n][1], dp[n][2]));
    }
}
/*
dp[i][j]
=> 현재까지 j개의 계단을 연속해서 밟고 i번째 계단까지 올라섰을 때
점수 합의 최댓값, 단 i번째 계단은 반드시 밟아야 함

dp[k][1] = ?
=> 현재까지 1개의 계단을 연속해서 밟고 k번째 계단까지 올라섰을 때
점수 합의 최댓값

=> k-1번째 계단을 밟지 않음
=> k-2번째 계단은 밟음(계단은 1계단 or 2계단 씩 오를 수 있기 때문)
=> dp[k][1] = max(dp[k-2][1], dp[k-2][2]) + s[k]
=> s[k]는 k번째 계단에 쓰여있는 점수

dp[k][2] = ?
=> 현재까지 2개의 계단을 연속해서 밟고 k번째 계단까지 올라섰을 때
점수 합의 최댓값

=> k-1번째 계단을 밟음(이 당시에 1개의 계단을 연속해서 밟은 상태여야 함)
=> 왜냐하면 2개의 계단을 밟으면 총 3개 연속으로 계단을 밟게 됨.
=> dp[k][2] = dp[k-1][1] + s[k]

마지막 계단은 무조건 밟아야 하기때문에
=> max(dp[n][1], dp[n][2]) 출력
 */