// 30802번
package ICPC.Week1;

import java.util.Scanner;

public class Q30802 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int a[] = new int[6];

        for (int i = 0; i < 6; i++) {
            a[i] = stdin.nextInt();
        }
        int t = stdin.nextInt();
        int p = stdin.nextInt();

        int count = 0;

        for (int i = 0; i < 6; i++) {
            count += a[i] / t;
            if(a[i] % t != 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(N/p + " " + N%p);
    }
}
