package Random.Random1Day9M;

import java.util.Scanner;

import static java.lang.String.format;

public class Q2670 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        double arr[] = new double[n+1];
        double dp[] = new double[n+1];
        double max = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = stdin.nextDouble();
            dp[i] = Math.max((dp[i-1] * arr[i]) ,arr[i]);
            max = Math.max(max,dp[i]);  
        }

        System.out.println(String.format("%.3f", max));
    }
}

/*

1.1 -> arr1 = dp1

1.1 * 0.7 = 0.77 -> dp2 = dp1 * arr2


0.77 * 1.3 = 1.001 -> dp3 = dp2 * arr3
1.3 > 0.77 이므로 dp3 = 1.3


1.3 * 0.9 = 1.17 -> dp4 = Math.max(dp3 * arr4, arr4)
1.17 > 0.9 이므로 dp4 = 1.17

1.17 * 1.4 = 1.638 -> arr5

 */