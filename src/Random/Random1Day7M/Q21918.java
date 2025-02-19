// 전구
package Random.Random1Day7M;

import java.util.Scanner;

public class Q21918 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int m = stdin.nextInt();

        int arr [] = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = stdin.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            int c = stdin.nextInt();

            switch (a) {
                case 1:
                    arr[b] = c;
                    break;
                case 2:
                    for (int j = b; j <= c; j++) {
                        if(arr[j] == 0) {
                            arr[j] = 1;
                        } else {
                            arr[j] = 0;
                        }
                    }
                    break;
                case 3:
                    for (int j = b; j <= c; j++) {
                        arr[j] = 0;
                    }
                    break;
                case 4:
                    for (int j = b; j <= c; j++) {
                        arr[j] = 1;
                    }
                    break;
                }
            }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
/*
8 3
0 0 0 0 0 0 0 0
1 2 1 -> 0 1 0 0 0 0 0 0
1 4 1 -> 0 1 0 1 0 0 0 0
2 2 4 -> 0 0 1 0 0 0 0 0
 */