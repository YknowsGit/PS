package Random.Random1Day10M;

import java.util.Scanner;

public class Q11047 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();

        int coin[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            coin[i] = stdin.nextInt();
        }

        int count = 0;  // => 몫

        for (int i = n - 1; i >= 0; i--) {

            if(k >= coin[i]) {
                count += k / coin[i];
                k = k % coin[i];
            }
        }

        System.out.println(count);
    }
}

/*

k = 4200

4200 / 1000 =>
4 = count(몫),  200 = k % 1000(나머지)

200 / 100 =>
2 = count(몫), 0 = k % 100(나머지)

*/