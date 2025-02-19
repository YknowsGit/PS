package Random.Random1Day7M;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        double grade[] = new double[n];

        for (int i = 0; i < n; i++) {
              grade[i] = stdin.nextDouble();
        }

        double sum = 0;
        Arrays.sort(grade);

        for (int i = 0; i < grade.length; i++) {
            sum += ((grade[i]/grade[grade.length-1])*100);
        }

        System.out.println(sum / grade.length);
    }
}
