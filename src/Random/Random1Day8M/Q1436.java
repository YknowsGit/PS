// 영화감독 숌
package Random.Random1Day8M;

import java.util.Scanner;

public class Q1436 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int num = 666;
        int count = 1;

        while(count != n) {
            num++;

            // int형이 num을 String으로 변환한 뒤,
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}

/*
1. Interger.toString(number).contains("666")
2. String.valueOf(num).contains("666")

 n= 1   2    3    4    5    6    7    8    9
   666 1666 2666 3666 4666 5666 6660 6661 6662

*/