// RGB거리
package PS_Key_Problems.DP.Type.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][n+1];

        int[] costR = new int[n+1];
        int[] costG = new int[n+1];
        int[] costB = new int[n+1];
        int total = 0;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            costR[i] = Integer.parseInt(st.nextToken());
            costG[i] = Integer.parseInt(st.nextToken());
            costB[i] = Integer.parseInt(st.nextToken());

            dp[1][1] = costR[1];
            dp[1][2] = costG[1];
            dp[1][3] = costB[1];
        }

        for (int i = 2; i <= n; i++) {
            dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + costR[i];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + costG[i];
            dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + costB[i];

            total = Math.min(Math.min(dp[i][1], dp[i][2]), dp[i][3]);
        }

        System.out.println(total);
    }
}
/*
빨  초  파
26  40  83   => costR[1](dp[1][1])  costG[1](dp[1][2])  costB[1](dp[1][3])
49  60  57
13  89  99

빨: dp[k][1] = min(dp[k-1][2], dp[k-1][3]) + costR[k]
초: dp[k][2] = min(dp[k-1][1], dp[k-1][3]) + costG[k]
파: dp[k][3] = min(dp[k-1][1], dp[k-1][2]) + costB[k]
 */