// 소트인사이드
package UCPC.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Q1427 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = stdin.nextInt();

        String[] list = String.valueOf(number).split("");

        // 내림차순 정렬
        Arrays.sort(list, Collections.reverseOrder());
/*
        for(int i=0; i<arr.length; i++){
            System.out.print(list[i]);
        }
*/
    }
}