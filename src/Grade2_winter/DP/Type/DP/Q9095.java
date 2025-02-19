// 1, 2, 3 더하기
package Grade2_winter.DP.Type.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[n]);
        }


    }
}
/*
1. 테이블 정의하기
dp[i] = i를 1, 2, 3의 합으로 나타내는 방법의 수

2. 점화식 찾기
dp[4] = ?
1+1+1+1, 3+1, 1+2+1, 2+1+1 => 끝의 값 1 (3을 1,2,3의 합으로 나타내는 방법의 가지 수: dp[3])
2+2, 1+1+2 => 끝의 값 2 (2를 1,2,3의 합으로 나타내는 방법의 가지수: dp[2])
1+3 => 끝의 값 3 (1을 1,2,3의 합으로 나타내는 방법의 가지수: dp[1])
총 7가지

dp[4] = 7

dp[3] = 4
1+1+1, 2+1 => 끝의 값 1
1+2 => 끝의 값 2
3 => 끝의 값 3
총 4가지

dp[2] = 2, dp[1] = 1


dp[5] = ?
1+1+1+1+1, 2+1+1+1, 1+2+1+1, 1+1+2+1, 3+1+1, 1+3+1, 2+2+1
1+1+1+2, 3+2, 2+1+2, 1+2+2
1+1+3, 2+3,
=> 13

dp[i] = dp[i-1] + dp[i-2] + dp[i-3]

3. 초기값 정하기
dp[1] = 1, dp[2] = 2, dp[3] = 4
dp[i] = dp[i-1] + dp[i-2] + dp[i-3]이기 때문에
초기값이 최소 3개는 주어져야 함
 */