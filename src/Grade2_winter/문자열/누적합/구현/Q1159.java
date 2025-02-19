// 농구 경기
package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int alp[] = new int[26];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            alp[str.charAt(0) - 'a']++; // str의 첫 알파벳 카운트
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alp.length; i++) {
            if (alp[i] >= 5) {
                sb.append((char)(i + 'a'));
            }
        }

        if(sb.length() > 0) {
            System.out.println(sb);
        } else {
            System.out.println("PREDAJA");
        }
    }
}
