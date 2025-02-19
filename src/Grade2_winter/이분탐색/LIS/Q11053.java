// 가장 긴 증가하는 부분 수열
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int dplength = 0;

        for (int i = 0; i < n; i++) {
            dplength = Math.max(dplength, dp[i]);
        }

        System.out.println(dplength);
    }
}
/*
i = 0
arr[0] = 10, dp[0] = 1

i = 1
arr[1] = 20 > arr[0] = 10,
dp[1] = dp[0] + 1 = 2
      => dp[1]은 2로 업데이트

i = 2
arr[2] = 10 > arr[0] = 10, arr[1] = 20
=> 만족하지 않음.

i = 3
arr[3] = 30 > arr[0] = 10, arr[1] = 20, arr[2] = 10
dp[3] = dp[2] + 1 = 2
      = dp[1] + 1 = 3
      = dp[0] + 1 = 2
      => dp[3]은 3으로 업데이트

i = 4
arr[4] =
 */