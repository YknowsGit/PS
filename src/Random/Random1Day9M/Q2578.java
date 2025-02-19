// 빙고
package Random.Random1Day9M;

import java.util.Scanner;

public class Q2578 {
    static int bingo[][] = new int[5][5];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = stdin.nextInt();
            }
        }

        for (int k = 1; k < 25; k++) {
            int num = stdin.nextInt();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(bingo[i][j] == num) {
                        bingo[i][j] = 0;
                    }
                }
            }

            colcheck();
            rowcheck();
            diagcheck1();
            diagcheck2();

            if(cnt >= 3) {
                System.out.println(k);
                break;
            }
            cnt = 0;
        }
    }

    // 열 단위 빙고체크
    public static void colcheck() {
        for (int j = 0; j < 5; j++) { // 각 열에 대해
            boolean isBingo = true;
            for (int i = 0; i < 5; i++) { // 각 행을 돌면서
                if(bingo[i][j] != 0) { // 해당 열의 모든 숫자가 0이 아니면
                    isBingo = false; // 빙고X
                    break; // 빠져나오기
                }
            }
            if(isBingo) {
                cnt++; // 빙고면 cnt
            }
        }
    }

    // 행 단위 빙고체크
    public static void rowcheck() {
        for (int i = 0; i < 5; i++) {
            boolean isBingo = true;
            for (int j = 0; j < 5; j++) {
                if(bingo[i][j] != 0) {
                    isBingo = false;
                    break;
                }
            }
            if(isBingo) {
                cnt++;
            }
        }
    }

    // 대각선 빙고체크(왼 상단 오 하단)
    public static void diagcheck1() {
        boolean isBingo = true;
        for (int i = 0; i < 5; i++) {
            if(bingo[i][i] != 0) {
                isBingo = false;
                break;
            }
        }
        if(isBingo) {
            cnt++;
        }
    }

    // 대각선 빙고체크(오 상단 왼 하단)
    public static void diagcheck2() {
        boolean isBingo = true;
        for (int i = 0; i < 5; i++) {
            if(bingo[i][4-i] != 0) {
                isBingo =false;
                break;
            }
        }
        if(isBingo) {
            cnt++;
        }
    }
}

/*
5 10 7 16 2
4 22 8 17 13
3 18 1 6 25
-> 여기 까지 해서 빙고 3개 만들어짐
-> 그래서 출력 값 cnt = 15

12 19 23 14 21
11 24 9 20 15


diagcheck1 vs diagcheck2

-> 1: 왼쪽 상단에서 오른쪽 하단으로 내려가는 대각선
-> (\\\\\\) (5, 22, 1, 14, 15)

-> 2: 왼쪽 하단에서 오른쪽 상단으로 올라가는 대각선
-> (//////) (11, 19, 1, 17, 2)

 */
