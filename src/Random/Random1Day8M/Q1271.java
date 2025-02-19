package Random.Random1Day8M;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        BigInteger n = stdin.nextBigInteger();
        BigInteger m = stdin.nextBigInteger();

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
