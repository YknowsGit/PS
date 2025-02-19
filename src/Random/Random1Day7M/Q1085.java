// 직사각형에서 탈출
package Random.Random1Day7M;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int x = stdin.nextInt();
        int y = stdin.nextInt();
        int w = stdin.nextInt();
        int h = stdin.nextInt();


        int x_min = Math.min(w-x, x);
        int y_min = Math.min(h-y, y);

        System.out.println(Math.min(x_min, y_min));
    }
}
