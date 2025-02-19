// 1159번
package ICPC.Week1;

import java.util.Scanner;

public class Q1159 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int []arr = new int[26];

        int n = stdin.nextInt();
        boolean ok = false;

        for (int i = 0; i < n; i++) {
            String name = stdin.next();
            char ch = name.charAt(0); // 소문자a = 97
            arr[ch - 'a']++; // 'a' -> 97
            if (arr[ch - 'a'] == 5) {
                ok = true;
            }
        }
        if(ok) {
            for (int i = 0; i < 26; i++) {
                if(arr[i] >= 5) {
                    System.out.print((char)(i +'a'));
                }
            }
        }
        else {
            System.out.println("PREDAJA");
        }

    }
}


/*
소문자 알파벳 아스키코드

97 ~ 122 -> 122 - 97 = 25
 */