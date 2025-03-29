// n과 m(3)
package PS_Key_Problems.완전탐색.백트래킹.Type.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15651 {

    static int n, m;
    static int[] arr = new int[10];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        func(0);

        System.out.println(sb.toString());
    }

    public static void func(int k) {
        if(k == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[k] = i;
            func(k+1);
        }
    }
}
/*
1부터 n까지의 자연수 중에 중복있이 m개를 고른 수열을 나열
=> isUsed함수를 안쓰면 중복 포함하여 수열 나열 가능!

StringBuilder를 사용하여 시간초과 해결
 */