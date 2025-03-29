// 나는야 포켓몬 마스터 이다솜
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 도감에 수록되어있는 포켓몬 개수
        int m = Integer.parseInt(st.nextToken()); // 내가 맞춰야하는 개수

        HashMap <String, Integer> Str_pocketmon = new HashMap<>();
        HashMap <Integer, String> Int_pocketmon = new HashMap<>();
        // 1 ~ n까지 해당하는 포켓몬
        for (int i = 1; i < n+1; i++) {
            String name = br.readLine();
            Str_pocketmon.put(name, i);
            Int_pocketmon.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        // m개의 내가 맞춰야하는 문제
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if(c >= '0' && c <= '9') {
                int num = Integer.parseInt(str);
                System.out.println(Int_pocketmon.get(num));
            } else {
                System.out.println(Str_pocketmon.get(str));
            }
        }
    }
}

/*
Character.isDigit 메서드

문자열에서 숫자를 필터링하거나 숫자 여부를 확인하는 메서드

Character.isDigit 구현
=> return ch >= '0' && ch <= '9'
 */