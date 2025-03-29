// 균형잡힌 세상
package PS_Key_Problems.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (true) {

            line = br.readLine();
            if (line.equals(".")) {
                break;
            }

            boolean TF = true;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        TF = false;
                        break;
                    }

                    char top = stack.pop();
                    if(c == ')' && top != '(') {
                        TF = false;
                        break;
                    }

                    if(c == ']' && top != '[') {
                        TF = false;
                        break;
                    }
                }
            }

            if(TF && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
