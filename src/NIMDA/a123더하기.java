// 9095
package NIMDA;

import java.util.Scanner;
public class a123더하기 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int t = stdin.nextInt();

        int dp[] = new int [11];
        dp[1] = 1; // 1
        dp[2] = 2; // 2, 1+1
        dp[3] = 4; // 3, 2+1, 1+2, 1+1+1
      //dp[4] = 7  // 4, 3+1, 1+3, 2+2, 1+2+1, 1+1+2, 2+1+1, 1+1+1+1
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        for (int i = 0; i < t; i++) {
            int n = stdin.nextInt();
            System.out.println(dp[n]);
        }
    }
}
