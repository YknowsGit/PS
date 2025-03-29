package PS_Key_Problems.완전탐색.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class REVIEW {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int cnt = 0;
        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < aeiou.length; j++) {
                if(name.charAt(i) == aeiou[j]) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

}
/*
1. 정렬해서 푸는 방식
2. Max와 Min 값을 구해서 전체 합한값에서 빼면 두번째 값만 나오는 방식
3. 3가지 값을 모두 비교
 */
