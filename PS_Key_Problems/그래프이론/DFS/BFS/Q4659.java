// 비밀번호 발음하기
package PS_Key_Problems.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String test = br.readLine();
            if (test.equals("end")) {
                break;
            }

            char[] testChar = test.toCharArray();

            boolean containsAeoiu = false; // 모음 포함 여부
            int countAeiou = 0; // 연속 모음 카운트
            int countNoAeiou = 0; // 연속 자음 카운트
            boolean threeTimesalphabet = false; // 연속 3회 검사
            boolean twoTimesalphabet = false; // 같은 문자 2회 검사

            for (int i = 0; i < testChar.length; i++) {

                boolean isAeiou = (testChar[i] == 'a' || testChar[i] == 'e' ||
                                   testChar[i] == 'i' || testChar[i] == 'o' ||
                                   testChar[i] == 'u');

                if(isAeiou) {
                    containsAeoiu = true;
                    countAeiou++;
                    countNoAeiou = 0; // *연속적*으로 판단해야 하기 때문에
                } else {
                    countNoAeiou++;
                    countAeiou = 0;   // 초기화가 꼭 필요!
                }

                if(countAeiou >= 3 || countNoAeiou >= 3) {
                    threeTimesalphabet = true;
                    break;
                }

                if (i >= 1 && testChar[i - 1] == testChar[i]) {
                    if (testChar[i] != 'e' && testChar[i] != 'o') {
                        twoTimesalphabet = true; // 조건 만족
                        break; // 반복 종료
                    }
                }

            }

            StringBuilder sb = new StringBuilder();
            sb.append("<");
            for (int k = 0; k < testChar.length; k++) {
                sb.append(testChar[k]);
            }
            sb.append("> is ");
            if (!containsAeoiu || threeTimesalphabet || twoTimesalphabet) {
                sb.append("not ");
            }
            sb.append("acceptable.");

            System.out.println(sb);

        }
    }

}

/*
boolean  containsaeiou
boolean  threeTimesalphabet
boolena  doubleTimesalphabet
1. 모음(a, e, i, o, u) 하나를 반드시 포함
2. 모음이 3개 or 자음이 3개 연속으로 오면 안 됨.
3. 같은 글자가 연속적으로 두번 오면 안됨. ee와 oo는 허용
 */