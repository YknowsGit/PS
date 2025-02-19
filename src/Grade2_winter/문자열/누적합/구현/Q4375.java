// 1
package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input = br.readLine()) != null) {
            int num = 1; // 모든 자릿수 1로 초기화
            int cnt = 1; // 자릿수 1씩 증가
            while (num % Integer.parseInt(input) != 0) {
                num = (num * 10 + 1) % Integer.parseInt(input);
                cnt++;
            }
            System.out.println(cnt);
        }

    }
}

/*
3 => 1 % 3 = 1 / num % Integer.parseInt(input)
  => 11 % 3 = 2
  => 111 % 3 = 0 따라서 출력 값 : 3

6 => 1 % 6 = 1
  => 11 % 6 => 5
  ...
  => 111111 % 6 => 0 따라서 출력 값 : 6

어떻게 풀꺼야?
입력값만큼 String 1을 붙혀 숫자로 전환한뒤
입력값으로 나머지값이 0이 되는지 판별

0이 되면 while문 끝내고 자릿수 출력
0이 아니면 계속해서 while문 반복

 */

/*
나머지 연산
=> num = (num * 10 + 1) % Integer.parseInt(input)

 */