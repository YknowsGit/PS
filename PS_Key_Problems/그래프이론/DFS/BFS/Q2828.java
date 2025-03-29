// 사과 담기 게임
package PS_Key_Problems.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 스크린 칸의 개수
        int m = Integer.parseInt(st.nextToken()); // 바구니가 차지하는 스크린 칸의 개수

        int j = Integer.parseInt(br.readLine()); // 사과의 개수

        int dist = 0;
        int start = 1;
        int end = m;
        for (int i = 0; i < j; i++) {
            int l = Integer.parseInt(br.readLine()); // 사과가 떨어지는 위치

            if(end < l) {
                dist += l - end;
                start = start + (l - end);
                end = l;
            } else if(start > l) {
                dist += start - l;
                end = end  - (start - l);
                start = l;
            }
        }
        System.out.println(dist);

    }
}
/*

| 1 | 2 | 3 | 4 | 5 |     N = 5

*바구니* 1칸 차지           M = 1
1 -> 5 -> 3  출력 값 : 6

*바구니* 2칸 차지           M = 2
1 -> 5 -> 3  출력 값 : 4

절댓값 Math.abs

바구니 시작 위치 start 1
바구니 끝 위치 end 2

if 바구니 끝 위치2 < 사과의 위치5
오른쪽으로 이동
start 1 = start 1 + (사과의 위치 5  - end 2 )
end = 사과의 위치

if 바구니 시작 위치 4 > 사과의 위치 3
왼쪽으로 이동
end = end 5 - (start 4 - 사과의 위치 3)
start = 사과의 위치 3
 */