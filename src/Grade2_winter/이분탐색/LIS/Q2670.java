// 연속부분최대곱
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2670 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double[] curMax = new double[n+1];
        double max = 0;
        for (int i = 1; i <= n; i++) {
            curMax[i] = Math.max(arr[i], curMax[i-1] * arr[i]);
            max = Math.max(max, curMax[i]);
        }

        System.out.println(String.format("%.3f", max));

    }
}
/*
1.1 | 0.7 | 1.3 | 0.9 | 1.4 | 0.8 | 0.7 | 1.4

1.1 과 1.1 * 0.7 비교....

현재 인덱스 까지의 연속된 것이 큰지 Vs
현재 인덱스 값이 큰지 비교하여
curMax배열에 집어 넣고 계속 비교

 */