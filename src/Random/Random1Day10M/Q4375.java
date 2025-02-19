package Random.Random1Day10M;

import java.util.Scanner;

public class Q4375 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while (stdin.hasNextInt()) {
            int n = stdin.nextInt();
            int namegi = 0;

            for (int i = 1; i <= n; i++) {
                namegi = (namegi*10 + 1) % n;
                if(namegi == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}

/*
1 % 3 =
11 % 3 =
111 % 3 = 0 이면 1의 갯수 반환 해서 출려 값은 3

1 => 11
1 + 10 => 11

1 => 111
1 + 10 + 100 => 111

1 => 1111
1 + 10 + 100 + 1000 => 1111

 */