// 수열
package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int sequence[] = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st1.nextToken());
        }

        int max = 0;
        for (int i = 0; i < k; i++) {
            max += sequence[i]; // 먼저, 0부터 k까지의 합 계산
        }

        int current = max;
        for (int i = k ; i < n; i++) {
            current = current + sequence[i] - sequence[i-k];
            max = Math.max(max, current);

        }
        System.out.println(max);
    }
}

/*
풀이

=> 슬라이딩 윈도우

3 -2 -4 -9 0 3 7 13 8 -3      n = 10
  1 -6 -13 -9 3 10 20 21 5    n = 9



 */