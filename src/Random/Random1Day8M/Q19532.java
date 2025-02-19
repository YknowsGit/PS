// 수학은 비대면강의입니다
package Random.Random1Day8M;

import java.util.Scanner;

public class Q19532 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();
        int d = stdin.nextInt();
        int e = stdin.nextInt();
        int f = stdin.nextInt();

        for (int i = -999; i <= 999 ; i++) {
            for (int j = -999; j <= 999 ; j++) {
                if(a*i + b*j == c) {
                    if(d*i + e*j == f) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
