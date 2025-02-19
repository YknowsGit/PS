package Random.Random1Day7M;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int count = 1;
        int range = 2;

        if(n == 1) {
            System.out.println(1);
        } else {
            while(range <= n) {
                range = (6 * count) + range;
                count++;
            }
            System.out.println(count);
        }

    }
}

/*
1 -> 1

2 ~ 7 -> 2 
8 ~ 19 -> 3
20 ~ 37 -> 4
38 ~ 61 -> 5
62 ~ 87 -> 6
88

8 = 6*1 + 2
20 = 6*2 + 8
38 = 6*3 + 20

 */