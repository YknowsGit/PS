// 팰린드롬인지 확인하기
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean palindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                palindrome = false;
                break;
            }
        }

        if(palindrome == true){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

/*
StringBuilder sb = new StringBuilder(str);
if(str.equals(sb.reverse().toString()))

// toString() => StringBuilder 객체를 문자열로 변환
 */