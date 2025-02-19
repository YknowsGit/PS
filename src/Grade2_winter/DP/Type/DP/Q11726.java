// 2*n 타일링
package Grade2_winter.DP.Type.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11726 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
/*
dp[1] = 1, dp[2] = 2
dp[3] = 3

dp[4] = 5

dp[k] = dp[k-1] + dp[k-2]
=> 피보나치 수열

dp[i] = dp[i-1] + dp[i-2]라고만 써놓고 제일 마지막에 d[i] % mod
를 출력하는 식으로 코드를 짜게되면 계산 중간에 int overflow가 발생하여
틀리게 되니 코드 중간 중간에 계속 10007로 나눈 나머지만을 가져가도록 해야 함
 */