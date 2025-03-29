// 팰린드롬 만들기
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String name = br.readLine();

        int alp[] = new int[26]; // 알파벳의 갯수를 세는 배열
        for (int i = 0; i < name.length(); i++) {
            alp[name.charAt(i) - 'A']++; // 아스키 코드를 활용하여 알파벳의 위치++
        }

        int middle = 0; // 알파벳에 홀수가 있다면 중앙에만 위치
        int odd = 0; // 홀수 알파벳이 2개 이상이면 팰린드롬 불가

        for (int i = 0; i < alp.length; i++) {
            if(alp[i] % 2 == 1) {
                middle = i;
                odd++;
            }

            if(odd >= 2) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alp.length; i++) {
            for (int j = 0; j < alp[i]/2; j++) {
                sb.append((char) (i + 'A'));
            }
        }
        String result = sb.toString(); // 문자열을 조합한 뒤 String으로 변환

        if(odd == 1) {
            result += (char) (middle + 'A');
        }
        result += sb.reverse().toString();
        System.out.println(result);
    }
}
/*
홀수인 알파벳이 2개 이상 들어가면 팰린드롬 불가
홀수인 알파벳이 중간에 들어가야 팰린드롬이 됨.

 */