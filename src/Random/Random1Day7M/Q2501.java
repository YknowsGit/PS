// 약수 구하기
package Random.Random1Day7M;

import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int k = stdin.nextInt();

        int count = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }

            if(count == k) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
