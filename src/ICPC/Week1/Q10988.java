// 10988번
package ICPC.Week1;

import java.util.Scanner;

public class Q10988 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String str = stdin.next();
        int ans = 1;

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}

/*
팰린드롬 확인방법

1. 문자 그대로 읽는다 -> str.charAt(i)
2. 문자를 거꾸로 읽는다 -> str.charAt(str.length()-i-1)
3. 1번과 2번이 같은지 비교한다.
4. 같으면 1, 다르면 0을 출력한다.
*/
