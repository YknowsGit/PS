// 소수
package Random.Random1Day8M;

import java.util.Scanner;

public class Q2581 {

    public static boolean prime[];

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int m = stdin.nextInt();
        int n = stdin.nextInt();

        prime = new boolean[n + 1];
        isPrime();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if(prime[i] == false) {
                sum += i;
                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }


    // 에라토스테네스의 체: 소수 판별 알고리즘
    public static void isPrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}

/*
Interger.MAX_VALUE를 min(최소값)으로 두는 이유?

min의 초기값을 Integer.MAX_VALUE로 설정하면, 프로그램이
실행될 때 실제로 발견되는 값은 모두 이 초기값보다 작거나 같기 때문에,
최소값을 올바르게 찾을 수 있습니다.
 */