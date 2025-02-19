// 교수가 된 현우
package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3474 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int multiTwo = 0;
            int multiFive = 0;
            for (int j = 2; j <= n ; j *= 2) {
                multiTwo += n/j; // 60/2=30 , 60/4 = 15
            }
            for (int j = 5; j <= n; j *= 5) {
                multiFive += n/j; // 60/5=12 60/25
            }

            int min = Math.min(multiTwo, multiFive);
            System.out.println(min);
        }
        // 2 4 6 8 10 12 ... 60 -> 30
        // 1 2 3 4 5 6 ...   30 -> 15
        //   1   2   3 ...   15 ->

        // 5 10 15 20 25 30 35 40 45 50 55 60
        // 1 2 3 4 5 6 7 8 9 10 11 12 => 12개
        //         1         2        => 2개

    }
}
/*
               / 오른쪽 끝 0의 개수
3! => 321 = 6  / 0개

10! => 10 9 8 7 6 5 4 3 2 1
5의 배수 : 5 10
5가 1번 포함 된 경우 : 5 10 => 총 2개

2의 배수 : 2 4 6 8 10
2가 1번 포함 된 경우: 2 4 6 8 10
2가 2번 포함 된 경우: 4 8
2가 3번 포함 된 경우: 8 => 총 8개

5의 배수, 2의 배수 최솟값 => 2개

60! => 60 59 58 57 56 55 54 53 52 51
        1  2  3  4  5  6  7  8  9  10 -> 4

       50 49 48 47 46 45 44 43 42 41
       11 12 13 14 15 16 17 18 19 20 ->  4

       40 39 38 37 36 35 34 33 32 31
       21 22 23 24 25 26 27 28 29 30 ->  4

5의 배수: 5 10 15 20 25 30 35 40 45 50 55 60
=> 25 랑 50 은 5가 두번 곱해짐 총 14개

 */
/*
첫 번째 루프(2의 배수):

j = 2: 60 / 2 = 30 (2의 배수 개수는 30)
j = 4: 60 / 4 = 15 (4의 배수 개수는 15)
j = 8: 60 / 8 = 7 (8의 배수 개수는 7)
j = 16: 60 / 16 = 3 (16의 배수 개수는 3)
j = 32: 60 / 32 = 1 (32의 배수 개수는 1)
더 이상 나누어 떨어지지 않으므로 루프 종료.
결과적으로 multiTwo = 30 + 15 + 7 + 3 + 1 = 56

두 번째 루프(5의 배수):

j = 5: 60 / 5 = 12 (5의 배수 개수는 12)
j = 25: 60 / 25 = 2 (25의 배수 개수는 2)
더 이상 나누어 떨어지지 않으므로 루프 종료.
결과적으로 multiFive = 12 + 2 = 14
 */