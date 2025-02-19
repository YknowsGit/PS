package Random.Random1Day7M;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();

        int []arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                arr[ch - 'A']++; // 해당 인덱스의 값 1 증가
            } else {
                arr[ch - 'a']++;
            }

        }

        int max = -1;
        char cha = '?';

        for (int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                cha = (char) (i + 'A');
            }
            else if(arr[i] == max) {
                cha = '?';
            }
        }
        System.out.println(cha);
    }
}

/*
arr[i]가 현재 최대 빈도수 max와 같다면...

이는 이미 최대 빈도수를 가진 문자가 존재하는 상황에서
또 다른 동일한 빈도수를 가진 문자를 발견한 것이다
 */