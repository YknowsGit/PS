// 럭비 클럽
package Random.Random1Day8M;

import java.util.Scanner;

public class Q2083 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while(true) {
            String name = stdin.next();
            int a = stdin.nextInt();
            int b = stdin.nextInt();

            if(name.equals("#") && a == 0 && b == 0) {
                break;
            }

            if(a > 17 || b >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
