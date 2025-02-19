// OX퀴즈
package Random.Random1Day8M;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        String arr[] = new String[n];


        for (int i = 0; i < n; i++) {
            arr[i] = stdin.next();
        }

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
