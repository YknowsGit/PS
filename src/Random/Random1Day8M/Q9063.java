package Random.Random1Day8M;

import java.util.Arrays;
import java.util.Scanner;

public class Q9063 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = stdin.nextInt();
            y[i] = stdin.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println((x[n-1] - x[0])*(y[n-1] - y[0]));
    }
}
