package Random.Random1Day7M;

import java.util.Scanner;

public class Q25206 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        double grade3 = 0;

        double total = 0;

        for (int i = 0; i < 20; i++) {

            String str = stdin.next();

            double grade = stdin.nextDouble();

            String grade2 = stdin.next();

            if(grade2.equals("A+") ) {
                grade3 += grade * 4.5;
                total += grade;
            } else if(grade2.equals("A0") ) {
                grade3 += grade * 4.0;
                total += grade;
            } else if(grade2.equals("B+") ) {
                grade3 += grade * 3.5;
                total += grade;
            } else if(grade2.equals("B0") ) {
                grade3 += grade * 3.0;
                total += grade;
            } else if(grade2.equals("C+") ) {
                grade3 += grade * 2.5;
                total += grade;
            } else if(grade2.equals("C0") ) {
                grade3 += grade * 2.0;
                total += grade;
            } else if(grade2.equals("D+") ) {
                grade3 += grade * 1.5;
                total += grade;
            } else if(grade2.equals("D0") ) {
                grade3 += grade * 1.0;
                total += grade;
            } else if(grade2.equals("F") ) {
                grade3 += grade * 0.0;
                total += grade;
            }
        }
        System.out.printf("%6f", grade3 / total);
    }
}
