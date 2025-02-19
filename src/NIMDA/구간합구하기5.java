// 11660
package NIMDA;

import java.util.Scanner;


public class 구간합구하기5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N, M;
        N = stdin.nextInt();
        M = stdin.nextInt();

        int i, j;
        int[][] arr = new int[N + 1][N + 1];
        int[][] dp = new int[N + 1][N + 1];
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                arr[i][j] = stdin.nextInt();
            }
        }

        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                dp[i][j] = arr[i][j] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        int x1, x2, y1, y2;
        for (i = 0; i < M; i++) {
            x1 = stdin.nextInt();
            y1 = stdin.nextInt();
            x2 = stdin.nextInt();
            y2 = stdin.nextInt();
            System.out.println("\n");
            System.out.println(dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1]);
        }
    }
}

