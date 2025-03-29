// ROT13
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char [] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            if(str[i] >= 'A' && str[i] <= 'Z') { // 대문자일 경우
                if(str[i] >= 'N') {
                    str[i] -= 13; // N 이상
                } else {
                    str[i]  += 13;
                }
            } else if(str[i] >= 'a' && str[i] <= 'z') {
                if(str[i] >= 'n') {
                    str[i] -= 13; // n 이상
                } else {
                    str[i]  += 13;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        System.out.println(sb);
    }
}
