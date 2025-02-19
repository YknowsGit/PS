// 안녕
package Grade2_winter.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1535 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] l = new int[n+1];
        int[] maxJoy = new int[n+1];
        int[][] dp = new int[n+1][101];

        for (int i = 1; i <= n; i++) {
            l[i] = Integer.parseInt(st1.nextToken());
            maxJoy[i] = Integer.parseInt(st2.nextToken());
        }

        for (int j = 0; j <= 100; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 100; j++) {

                if (j - l[i] > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - l[i]] + maxJoy[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int maxJoyful = 0;
        for (int j = 0; j <= 100; j++) {
            maxJoyful = Math.max(maxJoyful, dp[n][j]);
        }

        System.out.println(maxJoyful);

    }
}
/*
체력: 100(초기값), 기쁨: 0(초기값)
100, 0
100-1=99, 20
99-21=78, 50
78-79=-1 < 0 => break

dp[i][j]
=>  i번째 사람까지 인사를 했을 때,
체력이 j일 때 얻을 수 있는 최대 기쁨

dp[0][j]
=> 0번째 사람까지 인사를 했을 때,
체력이 j일 때 얻을 수 있는 최대 기쁨=> 0
dp[i][0]
=> 체력이 0일 때 얻을 수 있는 최대 기쁨=> 0

인사를 하는 경우

dp[i][j] = max(dp[i][j], dp[i-1][j - l[i]] + j[i])
if, j - l[i] < 0 => break;

인사를 하지 않는 경우

dp[i][j] = dp[i-1][j]


 */