// 곱셈
package Grade2_winter.문자열.누적합.구현;

import java.io.*;
import java.util.StringTokenizer;

public class Q1629 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); // 밑
        long b = Long.parseLong(st.nextToken()); // 지수
        long c = Long.parseLong(st.nextToken()); // 나눌 값

        System.out.println(pow(a, b, c));
    }

    private static long pow (long a, long b, long c) {
        // 지수가 1이면 바로 나머지 구하기
        if(b == 1) {
            return a % c;
        }
        // 지수가 1이상이면 지수를 반으로 나누어 다시 나머지 구하기
        // 분할 정복
        else {
            long halfpow = pow(a, b/2, c);
            // 지수가 홀수 일 때
            if(b % 2 == 1) {
                return (halfpow * halfpow % c) * a % c;
            }
            // 지수가 짝수 일 때
            return halfpow * halfpow % c;
        }
    }
}

/*
문제풀이 접근

단순하게 for문으로 돌릴 경우 시간복잡도 0.5를 넘길수밖에없음

컴퓨터는 1초에 약 1억번의 연산을 처리하는데
0.5초일 경우 5천번의 연산밖에 처리하지 못함

때문에 시간복잡도가 o(n)인 for문은 사용해서 안됨
따라서 분할정복을 이용해서 문제를 해결.

분할정복 예시
5^11

=> 5^5 * // 5^5 * 5
=> 여기서 구해진 5^5을 제곱한 뒤 5를 곱한다.
=> // 부분은 탐색하지 않아도 됨.

=> 5^5 = 5^2 * // 5^2 * 5

=> 5^2 = 5^1 * 5^1
*/

/*
StringTokenizer로 입력 분리

StringTokenizer를 사용해 공백으로 구분된 숫자를 각각 읽기

br.readLine()은 "10 11 12"라는 문자열 전체를 읽어온다.

그러나 이 문자열을 숫자로 변환하려고 하면 예외가 발생

숫자 세 개가 공백으로 구분되어 있으므로,

이를 각각 분리한 후 숫자로 변환해야 한다.
 */