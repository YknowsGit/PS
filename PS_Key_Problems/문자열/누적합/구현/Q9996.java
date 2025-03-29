// 한국이 그리울 땐 서버에 접속하지
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] pattern = br.readLine().split("\\*"); // 배열로 받아서 *기준으로 문자열 나누기

        for (int i = 0; i < n; i++) {
            String filename = br.readLine();

            // *을 뺀 패턴 문자열이 검증 파일 이름의 길이보다 짧아야 함.
            if(pattern[0].length() + pattern[1].length() > filename.length()) {
                System.out.println("NE");
                continue;
            }

            String front = filename.substring(0, pattern[0].length());
            String back = filename.substring(filename.length() - pattern[1].length(), filename.length());

            if(front.equals(pattern[0]) && back.equals(pattern[1])) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
