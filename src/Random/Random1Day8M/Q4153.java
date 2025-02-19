// 직각삼각형
package Random.Random1Day8M;

import java.util.Arrays;
import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[]arr = new int[3];
        while(true) {
            arr[0] = stdin.nextInt();
            arr[1] = stdin.nextInt();
            arr[2] = stdin.nextInt();

            Arrays.sort(arr);

            int aa = (int)Math.pow(arr[0], 2);
            int bb = (int)Math.pow(arr[1], 2);
            int cc = (int)Math.pow(arr[2], 2);


            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            } else if (aa + bb == cc) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }


    }
}
