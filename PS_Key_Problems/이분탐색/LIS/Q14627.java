// 파닭파닭 제출x
package PS_Key_Problems.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14627 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] pa = new int[s];
        for (int i = 0; i < s; i++) {
            pa[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i = 0; i < pa.length; i++) {
            sum += pa[i] % binarySearch(c, pa);
        }

        System.out.println(sum);
    }

    // 이분 탐색 (무엇을? => 이분탐색을 통해 탐색하는 값:
    // 파닭 하나에 들어가는 파의 최대 길이)
    public static int binarySearch(int c, int[] pa) {
        int start = 1;
        int end = 1_000_000_000;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            // 각 파에서 mid길이로 자를 수 있는 파닭의 개수 계산
            int count = 0;
            for (int i = 0; i < pa.length; i++) {
                count += pa[i] / mid;
            }

            if(count < c) {
                result = end;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
/*
 각각의 파닭에 같은 양의 파를 넣는다.
 될 수 있는 한 파의 양을 최대한 많이 넣으려고 한다.
 (but, 하나의 파닭에는 하나 이상의 파가 들어가면 안 된다.)
 */