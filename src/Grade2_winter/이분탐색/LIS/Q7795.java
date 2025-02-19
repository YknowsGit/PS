// 먹을 것인가 먹힐 것인가 제출x
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q7795 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // a의 수 n
            int m = Integer.parseInt(st.nextToken()); // b의 수 m

            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);

            st = new StringTokenizer(br.readLine());
            int[] b = new int[m];
            for (int j = 0; j < m; j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);

            int count = 0;
            for (int j = 0; j < n; j++) {
                int index = binarySearch(b, a[j]);
                count += index;
            }

            System.out.println(count);
        }
    }

    public static int binarySearch(int[] b, int a) {

        int start = 0;
        int end = b.length;

        while (start < end) { // Why? start <= end가 아닐까?
            int mid = (start + end) / 2;

            if(b[mid] < a) {
                start = mid + 1;
                // 배열b(1, 3, 6)의 mid원소값이 a(1, 1, 3, 7, 8)보다 작을 경우,
                // a보다 작은 값들은 mid값을 기준으로 왼쪽에 모두 존재
                // 따라서 start = mid + 1로 설정하여 오른쪽 절반 탐색
            } else {
                end = mid; // Why? end = mid - 1이 아닐까?
            }
        }
        return start;
    }
}
/*
8 1 7 3 1
3 6 1

=> 8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1
=> 총 7가지

2 13 7
103 11 290 215

=> 13-11
=> 총 1가지
 */