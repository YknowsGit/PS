// 트럭 주차
package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 한 대 주차시, 주차요금 1분에 한 대당 A원,
        int b = Integer.parseInt(st.nextToken()); // 두 대 주차시, 주차요금 1분에 한 대당 B원,
        int c = Integer.parseInt(st.nextToken()); // 세 대 주차시, 주차요금 1분에 한 대당 C원

        int count[] = new int[100];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st1.nextToken()); // 주차장 도착시간
            int end = Integer.parseInt(st1.nextToken()); // 주차장 떠난시간

            for (int j = start; j < end; j++) {
                count[j]++;
            }
        }

        int result = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0) {
                continue;
            } else if(count[i] == 1) {
                result += count[i]*a;
            } else if(count[i] == 2) {
                result += count[i]*b;
            } else if(count[i] == 3) {
                result += count[i]*c;
            }
        }
        System.out.println(result);
    }
}

/*
주차요금 a = 5, b = 3, c = 1

1~6
3~5
2~8

1~2 => 1 * 5(a) = 5
2~3 => 2 * 3(b) = 6
3~4 => 3 * 1(c) = 3
4~5 => 3 * 1(c) = 3
5~6 => 2 * 3(b) = 6
6~7 => 1 * 5(a) = 5
7~8 => 1 * 5(a) = 5

5+6+3+3+6+5+5 = 33

 */