package Random.Random1Day7M;

import java.util.Scanner;

public class Q1316 {
    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

        int n = stdin.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = stdin.next();

        for (int i = 0; i < str.length(); i++) {
            int state = str.charAt(i);
            // i번째 문자 저장(현재 문자)

            if(prev != state) {
                if(check[state - 'a'] == false) {
                    check[state - 'a'] = true;
                    prev = state;
                }

                else{
                    return false;
                }
            }


        }
        return true;
    }
}
