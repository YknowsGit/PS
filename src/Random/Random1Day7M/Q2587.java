package Random.Random1Day7M;

import java.util.Scanner;
import java.util.Arrays;

public class Q2587 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = stdin.nextInt();
        }

        int avg = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]) / 5;
        System.out.println(avg);

        Arrays.sort(arr);
        int mid = arr[2];
        System.out.println(mid);

    }
}
