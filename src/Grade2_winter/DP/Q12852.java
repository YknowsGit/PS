// 1로 만들기 2
// BakingDog 경로 추적
package Grade2_winter.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12852 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[1] = 0;
        int[] pre = new int[n + 1];
        pre[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            pre[i] = i - 1;

            if(i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                pre[i] = i / 3;
            }

            if(i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                pre[i] = i / 2;
            }
        }

        System.out.println(dp[n]);
        int cur = n;
        while (true) {
            System.out.print(cur + " ");

            if (cur == 1) {
                break;
            }

            cur = pre[cur];
        }

    }
}
/*
dp[6]
n이 3으로 나누어지면 3으로 나눈다
dp[i] = dp[i/3] + 1
n이 2로 나누어지면 2로 나눈다
dp[i] = dp[i/2] + 1
1을 뺀다.
dp[i] = dp[i-1] + 1

값 테이블 dp[]
1 2 3 4 5 6 7 8
0 1 1 2 3 2 3 3

경로 복원용 테이블 pre[] => 최적의 경로
1 2 3 4 5 6 7 8
0 1 1 2 4 3 6 4

dp[3]을 보면 3은 1or 2로 갈 수 있는데
dp[1]이 dp[2] 보다 작으므로
dp[3] = dp[1] + 1로 계산
=> 즉, dp[3] = 1, pre[3] = 1

dp[6]을 보면 6은 2or 3 or 5로 갈 수 있는데
dp[2]이 작으므로
dp[6] = dp[2] + 1로 계산
=> 즉, dp[6] = 2, pre[6] = 3
 */