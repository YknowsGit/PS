// N과 M(1)
package Grade2_winter.완전탐색.백트래킹.Type.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {

    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        func(0);
    }

    public static void func(int k) {

        if(k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                func(k + 1);
                isUsed[i] = false;
            }
        }
    }
}
/*
1부터 n까지의 자연수 중에 중복없이 m개를 고른 수열을 나열
순열 문제
 */

/*
import java.util.Scanner;

public class Main {
    static int n, m;  // n은 수의 범위, m은 선택할 수의 개수
    static int[] arr = new int[10];  // 선택된 수를 저장할 배열
    static boolean[] isused = new boolean[10];  // 각 수가 사용되었는지 여부를 나타내는 배열

    // 백트래킹 함수
    public static void func(int k) {
        if (k == m) {  // m개를 모두 선택했으면
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");  // 선택된 수들을 출력
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {  // 1부터 n까지의 수에 대해
            if (!isused[i]) {  // 해당 수가 아직 사용되지 않았으면
                arr[k] = i;  // k번째 위치에 i를 배정
                isused[i] = true;  // 해당 수를 사용했다고 표시
                func(k + 1);  // 다음 위치를 선택하기 위해 재귀 호출
                isused[i] = false;  // k번째 수를 i로 선택한 경우를 모두 확인했으므로, i를 다시 사용하지 않음
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        n = sc.nextInt();  // n: 수의 범위
        m = sc.nextInt();  // m: 선택할 수의 개수

        func(0);  // 백트래킹 함수 호출, 처음에는 k=0부터 시작
    }
}

 */