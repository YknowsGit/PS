// 도비의 영어 공부
package ICPC.Week1;

import java.util.Scanner;

public class Q2386 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while (stdin.hasNext()) {

            int count = 0;

            String n = stdin.next();
            String m = stdin.nextLine();
            // 각 줄에는 하나의 소문자와 영어 문장이 공백으로 이루어 짐.

            char ch = n.charAt(0);

            if(n.equals("#") || m.equals("#")){
                break;
            }

            for (int i = 0; i < m.length(); i++) {

                // 소문자
                if(ch == m.toLowerCase().charAt(i)){
                    count++;
                }
            }
            System.out.println(n + " " + count);
        }
    }
}
