// 블랙잭
package Random.Random1Day8M;

import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        int arr[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = stdin.nextInt();
        }

        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sum = arr[i] + arr[k] + arr[j];

                    if (sum == m) {
                        result = sum;
                        break;
                    } else if (result < sum && sum < m) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}

/*
else if 문
만약 sum이 m보다는 작지만
현재까지 찾은 합 result보다 크면,
result를 sum으로 업데이트
m에 가장 가까운 값을 계속 추적
 */