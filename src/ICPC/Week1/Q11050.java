// 11050번
package ICPC.Week1;

import java.util.Scanner;

public class Q11050 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int K = stdin.nextInt();

        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
    }

    static int factorial(int N) {
        if(N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
