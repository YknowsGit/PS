package Algorithm_mid;

import java.util.Scanner;
public class 동전0 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int K = stdin.nextInt();
        
        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = stdin.nextInt();
        }

        int count = 0;

        for (int i = N-1; i >=0 ; i--) {
            if(coin[i] <= K)
            {
                count += (K/coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
// *문제 접근 방법
//각 동전들은 '서로 배수 관계에 있다.'

// *그리디 알고리즘을 어떻게 적용할 수 있을까?
// 최적해를 찾아 나가는 것
// K원을 만들 때 최소한의 개수를 이용해야 하니 당연하게
// 가장 큰 가치를 지닌 동전부터 선택하는 것이 당연할 것이다.
// 즉, N개의 동전 중 가장 큰 가치를 지닌 동전부터 탐색
// 동전의 가치가 K보다 클 경우는 넘어가고,
// 아닐경우는 최대 구성 가능한 개수를 더해주면 된다.
