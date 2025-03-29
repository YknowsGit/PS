// 보석 상자
package PS_Key_Problems.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2792 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 아이들의 수
        int m = Integer.parseInt(st.nextToken()); // 색상의 수

        int[] k = new int[m];
        int low = 1;
        int high = 0;
        for (int i = 0; i < m; i++) {
            k[i] = Integer.parseInt(br.readLine());
            // k번째 줄에 주어지는 숫자는 k번 색상 보석의 개수
            high = Math.max(high, k[i]);
        }

        int result = high;
        // 질투심, 가장 많은 보석을 가져간 학생이 가지고 있는 보석의 개수

        // 이분 탐색
        // 정렬된 배열 => 질투심의 범위 (low(1) ~ high(max))
        // 찾을 값 => 해당 질투심(중간 값)을 만족하기 위해 필요한 최소 인원 수
        while(low <= high) {
            int mid = (low + high) / 2;
            int sum = 0; // 각 보석에 대해 필요한 학생 수
            for (int i = 0; i < m; i++) {
                if(k[i] % mid == 0) {
                    sum += k[i] / mid;
                } else {
                    sum += k[i] / mid + 1;
                }
            }

            if(sum <= n) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid +1;
            }

        }

        System.out.println(result);
    }
}

/*
이분탐색
=> 정렬되어 있는 배열에서 특정 데이터를 찾기 위해 모든 데이터를
순차적으로 확인하는 대신 탐색 범위를 절반으로 줄여가며 찾는 탐색방법
 */