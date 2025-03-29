// 괄호
package PS_Key_Problems.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String vps = br.readLine();
            boolean TF = true;

            for (int j = 0; j < vps.length(); j++) {
                if(vps.charAt(j) == '(') {
                    stack.push(vps.charAt(j));
                } else if (vps.charAt(j) == ')') {
                    if(stack.isEmpty()) {
                        TF = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(TF && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        }

    }
}
/*
(()())((()))

( 열린 괄호가 들어오면 스택에 넣어
) 닫힌 괄호가 들어오면 스택에서 스택 상단에 있는걸 빼

) 닫힌 괄호가 들어왔을때 스택이 비어있으면 NO출력


마지막에 스택이 비어있으면 YES 출력
스택에 남아있으면 NO 출력
 */