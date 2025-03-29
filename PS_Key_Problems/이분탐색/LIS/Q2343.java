// 기타 레슨
package PS_Key_Problems.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2343 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int max = 0;
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        int start = max; // 한 개의 강의가 최소 크기 따라서, 최소 크기는 강의 중 가장 긴 시간
        int end = sum; // 모든 강의 시간의 합

        StringBuilder sb = new StringBuilder();
        sb.append(binarySearch(n, m, arr, start, end));
        System.out.println(sb);

    }

    // 이분 탐색 (무엇을? => 이분탐색을 통해 탐색하는 값: 블루레이의 크기)
    public static int binarySearch(int n, int m,  int[] arr, int start, int end) {
        while(start <= end) {
            int sum = 0;
            int mid = (start + end) / 2;
            int count = 1;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if(sum > mid) {
                    count++;
                    sum = arr[i];
                }
            }
            if(count <= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }


}
/*
입력
9 3
1 2 3 4 5 6 7 8 9

출력
17
=> 1번 블루레이: 1, 2, 3, 4, 5  sum: 15
   2번 블루레이: 6, 7  sum: 13
   3번 블루레이: 8, 9  sum: 17

   9....22....45
   => {1, 2, 3, 4, 5, 6}, {7, 8}, {9}
   => count = 3(=M)
   => end = 22(mid) - 1 = 21
   => 같거나 작으면 블루레이 갯수 감소시키기!!

   9....15....21
   => {1, 2, 3, 4, 5}, {6, 7}, {8}, {9}
   => count = 4(>M)
   => start = 15(mid) + 1 = 16
   => 크면 블루레이 갯수 증가 시키기

   16....18....21
   => {1, 2, 3, 4, 5}, {6, 7}, {8, 9}
   => count = 3(=M)
   => end = 18(mid) - 1 = 17

   16(left, mid) 17(right)
   => {1, 2, 3, 4, 5}, {6, 7}, {8}, {9}
   => count = 4(>M)
   => start = 16(mid) + 1 = 17

   17(start, mid, end)
   => start = 17,,,


 */