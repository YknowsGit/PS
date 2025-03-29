// 부분수열의 합
package PS_Key_Problems.완전탐색.백트래킹.Type.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {

    static int n, s;
    static int[] arr = new int[30];
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        func(0, 0);

        // 공집합 -1
        if(s == 0) {
            cnt--;
        }

        System.out.println(cnt);
    }

    private static void func(int cur, int total) {
        // 종료 조건: 모든 원소 탐색
        if(cur == n) {
            // 현재까지의 합이 s와 같으면 cnt++
            if(total == s) {
                cnt++;
            }
            return;
        }
        // 현재 원소를 포함하지 않는 경우
        func(cur+1, total);
        // 현재 원소를 포함하는 경우
        func(cur+1, arr[cur]+total);
    }
}
/*
함수 내에서 i번째 수를 더할지 말지 정하고,
i+1번째 수를 정하러 한단계 더 들어간다는 관점
 */