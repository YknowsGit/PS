package Random.Random1Day7M;

import java.util.Scanner;

public class Q2869 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();
        
        int day = (c - b) / (a - b);

        int dayremain = (c - b) % (a - b);

        if(dayremain != 0) {
            day++;
        }

        System.out.println(day);

    }
}
/*
1 -> 2 - 1 = 1
2 -> 2 - 1 + 2 - 1 = 2
3 -> 2 - 1 + 2 - 1 + 2 - 1 = 3
4 -> 2 - 1 + 2 - 1 + 2 - 1 + 2 = 5

 */