// 숫자의 개수
package Random.Random1Day8M;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();

        int d = a * b * c;
        String str = Integer.toString(d);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

/*
문자(char)와 아스키 코드

'0', '1', '2' 등은 문자(char) 타입
-> Java에서 각 문자에는 해당하는 아스키(ASCII) 코드 값이 있음.
-> ex) '0'의 아스키 코드 값은 48, '1'은 49, '2'은 50, ... , '9'은 57
-> "123"이라는 문자열이 있다면, "123"은 각각 아스키
코드 값이 49, 50, 51인 문자 '1', '2', '3'로 구성되어 있음.

'0'의 역할
str.charAt(j)로 접근한 문자는 아스키 코드 값을 가짐.
'0'의 아스키 코드 값(48)을 빼면, 그 문자에 대응하는 숫자가 됨.
-> ex) '3' 문자(아스키 코드 51)에서 '0' 문자(아스키 코드 48)를 빼면 3이 됨.
-> 즉, str.charAt(j) - '0'은 문자 '0'부터 '9'까지를
0부터 9까지의 정수로 변환하는 방법
 */