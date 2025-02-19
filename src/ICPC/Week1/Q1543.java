// 1543번
package ICPC.Week1;

import java.util.Scanner;

public class Q1543 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String allstr = stdin.nextLine();
        String str = stdin.nextLine();

        int allsize = allstr.length();
        int size = str.length();

        allstr = allstr.replace(str,"");
        System.out.println((allsize - allstr.length()) / size);
    }
}

/*
String 관련 함수 중 특정 문자열을 원하는 문자열로 치환하는 함수

replace()
-> String replace(CharSequence target, CharSequence replacement);

replaceAll()
-> String replaceAll(String regex, String replacement);

replaceFrist()
-> String replaceFirst(char oldFirstChar, char newFistChar);
 */

/*
next(), nextLine() 차이점

-> Scanner 클래스의 메소드이다.
공통점은 둘다 문자열로 반환을 시켜준다는 점이고
차이점은 개행문자를 무시하냐 안하냐의 차이라고 할 수 있다.

next()는 개행문자를 무시하고 입력을 받고
nextLine()은 한줄 단위로 입력을 받기 때문에 개행문자로 포함한다.
 */