package Random.Random1Day7M;

import java.util.Scanner;

public class Q5086 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while (true) {
            int a = stdin.nextInt();
            int b = stdin.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            if (a % b == 0) {
                System.out.println("multiple");
            }

            else if (b % a == 0) {
                System.out.println("factor");
            }

            else {
                System.out.println("neither");
            }
        }

    }
}
