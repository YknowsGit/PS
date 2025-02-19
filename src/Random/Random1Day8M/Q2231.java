// 분해합
package Random.Random1Day8M;

import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        // n -> 256
        int sout = 0;
        for (int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
                // number -> 2, 4, 5
            }

            if(sum + i == n) {
                sout = i;
                break;
                // i -> 245
            }
        }
        System.out.println(sout);
    }
}
/*
256 -> 245 + 2arr[0] + 4arr[1] + 5arr[2] = 245
216 -> 198 + 1 + 9 + 8 = 216
 */