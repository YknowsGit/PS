package Random.Random1Day10M;

import java.util.Scanner;

public class Q1541 {
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);
        String input = stdin.next();

        String minus[] = input.split("-");
        int result = 0;

        for (int i = 0; i < minus.length; i++) {
            // -로 나눈 각 부분
            int tmp = 0;

            String plus[] = minus[i].split("\\+");

            for (int j = 0; j < plus.length; j++) {
                tmp += Integer.parseInt(plus[j]);
            }

            if(i == 0) {
                result += tmp;
            } else {
                result -= tmp;
            }
        }
        System.out.println(result);

    }
}


/*
최솟값이 되려면 큰 수들을 빼주면 되는데
+를 먼저 수행한다음 -를 수행한다면 최솟값ㅇㅇㅇ

*/