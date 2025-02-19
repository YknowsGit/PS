// 3986
package NIMDA;

import java.util.Scanner;
import java.util.Stack;

public class 좋은단어 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = stdin.nextInt();
        int ans = 0;

        for (int i = 0; i < count; i++) {
            String s = stdin.next();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (stack.empty()) {
                    stack.push(c);
                } else {
                    char prevc = stack.peek();
                    if (prevc == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.empty()) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}


// 1. 비어있으면 넣는다
// 2. 비어있지 않으면 peek이 현재 문자와 같은디 비교
// 3.
// 3.1) 같으면 Stack.pop
// 3.2) 다르면 Stack.push
// 4. 전부 탐색 후 Stack.isEmpty()를 통해
// 4.1) Stack이 비어있으면 좋은 단어
// 4.2) 비어있지 않으면 좋지 않은 단어


/*
String으로 저장된 문자열 중에서 한 글자만
선택해서 char타입으로 변환
*/