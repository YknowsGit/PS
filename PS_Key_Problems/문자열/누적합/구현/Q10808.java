// 알파벳 개수
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int alp[] = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            alp[c - 'a']++;

        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alp[i] + " ");
        }
    }
}
