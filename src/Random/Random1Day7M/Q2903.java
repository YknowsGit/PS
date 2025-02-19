package Random.Random1Day7M;

import java.util.Scanner;

public class Q2903 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        int res = 2;
        for (int i = 1; i <= n ; i++) {
            res = (res - 1) + res;
        }
        System.out.println(res*res);
    }
}

/*
다이나믹 프로그래밍

0 -> 4 (2)
1- > 9 (3) (2 - 1) + 2
2 -> 25 (5) (3 - 1) + 3
3 -> 81 (9) (5 - 1) + 5
4 -> 289 (17)
5 -> 1089 (33)

res = 2

(res - 1) + res

 */