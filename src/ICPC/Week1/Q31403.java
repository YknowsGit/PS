// 31403번
package ICPC.Week1;

import java.util.Scanner;

public class Q31403 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();

        System.out.println(a+b-c);

        String d = String.valueOf(a);
        String e = String.valueOf(b);
        String f = d+e;

        int g = Integer.parseInt(f);
        int h = g - c;
        System.out.println(h);

    }
}

// int -> String
// String.valueOf(i)

// String -> int
// Integer.pareInt(String)
// Integer.valueOf(String)