// 바구니 뒤집기
package Random.Random1Day7M;

import java.util.Scanner;

public class Q10811 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int m = stdin.nextInt();
        int temp = 0;

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int a = stdin.nextInt() - 1;
            int b = stdin.nextInt() - 1;

            while (a < b) {
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
12345
21345(12)
21435(34)
31425(14)
31425(22)
*/

