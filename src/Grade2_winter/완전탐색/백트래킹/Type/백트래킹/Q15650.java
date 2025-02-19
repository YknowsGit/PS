// N과 M(2)
package Grade2_winter.완전탐색.백트래킹.Type.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650 {

    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        func(0, 1);
    }

    public static void func(int k, int start) {
        if(k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            if(!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                func(k+1, i+1); // **다음 자리에서 i+1부터 시작
                isUsed[i] = false;
            }
        }

    }


}
/*
조합문제 (1번과의 차이 : 수들의 순서, 오름차순)
=> 수를 고를 때 이미 선택된 수보다 작은 수는 다시 선택하지 않도록 해야함.
 */