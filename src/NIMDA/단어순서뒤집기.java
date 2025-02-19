// 12605
package NIMDA;

import java.util.Scanner;

public class 단어순서뒤집기 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        stdin.nextLine();

        for (int i = 0; i < n; i++) {
            String s = stdin.nextLine();
            String arr[] = s.split(" ");

            System.out.print("Case #" + (i + 1) + ": ");

            for (int j = arr.length - 1 ; j >=0 ; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
// nextLine
// next와의 차이점큐