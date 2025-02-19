// 암기왕
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2776 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr1 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1);

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int arr2 = Integer.parseInt(st.nextToken());

                int index = Arrays.binarySearch(arr1, arr2);
                if(index >= 0) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

        }

        System.out.println(sb);
    }

}
