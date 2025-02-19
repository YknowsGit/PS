// 용돈 관리
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6236 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n]; // 현우가 i번째 날에 이용할 금액
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        int start = max; // 하루에 필요한 금액 중 가장 큰 값
        int end = sum;

        System.out.println(binarySearch(n, m, arr, start, end));
    }

    // 이분 탐색 (무엇을? => 이분탐색을 통해 탐색하는 값: 최소가 되는 k 값)
    public static int binarySearch(int n, int m, int[] arr, int start, int end) {

        while(start <= end) {
            int mid = (start + end) / 2; // 인출할 금액 k를 의미

            int count = 1; // 최소 한번은 인출 필요
            int remain = mid; // 첫 번째 날에 필요한 금액을 remain에 저장

            // 각 날의 금액 확인하면서 필요한 횟수 count
            for (int i = 0; i < n; i++) {
                if(remain < arr[i]) {
                    count++;
                    remain = mid;
                }
                remain -= arr[i];
            }

            if(count > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
/*
현우가 통장에서 인출해야 할 최소 금액 k 출력

현우는 통장에서 k원을 인출, 통장에서 뺀 돈으로
하루를 보낼 수 있으면 그대로 사용,
모자라게 되면 남은 금액을 통장에 집어넣고 다시 k원 인출

k = 500일 경우
입력  k  남은금액
100 500 400
400 400 0
300 500 200
100 200 100
500 (이전에 남은 금액 100을 버리고 인출한 금액 500) 0
101 500 남은 금액 399
400 (이전에 남은 금액 399을 버리고 인출한 금액 500) 100

현재 잔액 < 지출 금액
=> 현재 잔액을 전부 버리고 인출한 금액만 가지고 계산

현재 잔액 > 지출 금액
=> 인출하지 않고 현재 잔액 - 지출 금액


k를 너무 작게 설정하면 m번 이하로 인출 불가 => start = mid + 1
k를 너무 크게 설정하면 m번 이하로 인출 가능하나,
더 작은 k로도 해결 가능 => end = mid - 1
 */