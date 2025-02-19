// 27866번
package ICPC.Week1;

import java.util.Scanner;

public class Q27866 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String str = stdin.next();
        int num = stdin.nextInt()-1;

        System.out.println(str.charAt(num));

    }
}


/*
package ICPC.Week1;

import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String str = stdin.nextLine();
        int num = stdin.nextInt();

        for (int i = 0; i < str.length(); i++) {
            if(i == num) {
                char a = str.charAt(num-1);
                System.out.println(a);
            }
        }
    }
}

-> 자료형변환했을 때 출력값의 자료형이 동일한지 판단해야 함.
*/
