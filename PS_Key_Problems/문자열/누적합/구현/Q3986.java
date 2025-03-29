// 좋은 단어
package PS_Key_Problems.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if(!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if(stack.isEmpty()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

/*
1. 홀수 이면 안 됨.
2. 짝수
=> 이거 조차 스택을 판별 가능

단어의 각 문자를 순회하면서
스택이 비어있으면, 현재 문자를 스택에 넣음

스택 맨 위의 문자와 현재 문자가 같다면, 스택에서 문자를 꺼냄

스택 맨 위의 문자와 현재 문자가 다르다면, 스택에 문자를 넣음

순회가 끝나고 스택이 비어있으면 좋은단어
스택에 문자가 남아있다면 좋은단어X
 */