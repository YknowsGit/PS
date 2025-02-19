package Random.Random1Day9M;

import java.util.Scanner;


public class Q1010 {
    static int arr[][] = new int[30][30];

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int t = stdin.nextInt();

        for (int i = 0; i < t; i++) {
            int n = stdin.nextInt();
            int m = stdin.nextInt();

            System.out.println(function(m,n));
        }

    }

    static int function(int n, int r) {

        // 이미 지나 간 동쪽 사이트는 제외
        if(arr[n][r] > 0) {
            return arr[n][r];
        }

        if(r == 0 || n == r ) {
            return arr[n][r] = 1;
        }

        return arr[n][r] = function(n -1, r - 1) + function(n - 1, r);
    }
}

/*
서 vs 동

n m
서쪽의 사이트 개수만큼(N개) 다리를 지으려고 함.
다리끼리는 서로 겹쳐질 수 없다고 할때 다리를 지을 수 있는 경우의 수

5C2 = 10

조합 문제

nCr = n개중에 r개를 뽑는것
M(동)에서 N(서)을 뽑음  -> mCn

5C0 = 1
5C1 = 5
5C2 = 10
-> 4C1 = 4 + 6(4C2 = 6)
5C3 = 10
5C4 = 5
5C5 = 1

 */

/*
    static int function(int n, int r) {

        // 이미 지나 간 동쪽 사이트는 제외
        if(arr[30][30] > 0) {
            arr[30][30] = 0;
        } else if(arr[n][r] == 0 || n == r ) {
            arr[n][r] = 1;
        }



        return function(n -1, r - 1) + function(n - 1, r);
 */