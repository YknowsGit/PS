// 카드2
package ICPC.Week2;

import java.util.Scanner;

public class Q2164 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        /*
        ex) 1234
        1. 1버려 234남아
        2. 2뒤로보내 342
        3. 3버려 42남아
        4. 4뒤로보내 24
        5. 2버려 4남아
        */

        int que[] = new int[2*n];
        for (int i = 1; i <= n; i++) {
            que[i] = i;
        }
        int first_index = 1;
        int last_index = n;

// 1은 무조건 버리니까 1보다 큰 한장의 카드가 남을때까지
        for (int i = n; i > 1; i--) {
            first_index++; // 첫번째 카드 버려
            que[last_index + 1] = que[first_index];
            last_index++; // 현재 첫번째 카드 뒤로 보내
            first_index++; // 현재 첫번째 카드 또 버려
        }
        System.out.println(que[first_index]);
    }
}


/*
// 2164
package baekjoon;

import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        ex) 1234
        1. 1버려 234남아
        2. 2뒤로보내 342
        3. 3버려 42남아
        4. 4뒤로보내 24
        5. 2버려 4남아

int que[] = new int[2*n];
        for (int i = 1; i <= n; i++) {
que[i] = i;
        }
int first_index = 1;
int last_index = n;
// 1은 무조건 버리니까 1보다 큰 한장의 카드가 남을때까지
        for (int i = n; i > 1; i--) {
first_index++; // 첫번째 카드 버려
que[last_index + 1] = que[first_index];
last_index++; // 현재 첫번째 카드 뒤로 보내
first_index++; // 현재 첫번째 카드 또 버려
        }
        System.out.println(que[first_index]);
    }
            }


Queue
FIFO(first in first out)
은행창구
먼저 번호표를 뽑은사람이 먼저 은행서비스를 받음
-->> 새치기 ㄴㄴ
 */

