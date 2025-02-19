// 게임
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());

        long z = (y * 100) / x;

        if(z == 100) {
            System.out.println("-1");
        } else {
            long index = binarySearch(x, y, z);
            System.out.println(index);
        }

    }

    public static long binarySearch(long x, long y, long z) {
        long start = 0;
        long end = 1_000_000_000;

        while (start <= end) {
            long mid = (start + end) / 2;
            long newz = ((y + mid) * 100) / (x + mid);

            if(newz > z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
/*
x(게임 횟수), y(이긴 게임), z(승률)
=> 게임을 최소 몇 번 더 해야 z가 변할까?
=> 게임을 하면 무조건 이김

x * z% = y
z% = y / x
z = (y * 100) / x
=> z가 변하는 최소 게임 횟수??

승률이 절대 변하지 않는 경우는 언제일까?
=> 이미 승률이 100%(y와 x가 같거나) or 0%(x - y가 1) 인경우
 */