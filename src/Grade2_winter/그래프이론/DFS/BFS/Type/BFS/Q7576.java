// 토마토
// BakingDog 시작점이 여러개일 때
package Grade2_winter.그래프이론.DFS.BFS.Type.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7576 {

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board = new int [1002][1002];
    static int[][] dist = new int [1002][1002];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); // 행 세로
        int n = Integer.parseInt(st.nextToken()); // 열 가로

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1) { // 익은 토마토 = 시작점 위치
                    q.add(new Pair(i, j));
                    dist[i][j] = 0;
                } else if (board[i][j] == 0){
                    dist[i][j] = -1;   // 나머지 방문X, -1로 처리
                }
            }
        }

        while (!q.isEmpty()){
            Pair cur = q.poll();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(board[nx][ny] == 1 || dist[nx][ny] >= 0) continue;
                q.add(new Pair(nx, ny));
                dist[nx][ny] = dist[cur.x][cur.y] + 1;
                board[nx][ny] = 1; // 토마토 익었음을 처리
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dist[i][j] == -1) {
                    System.out.println(-1);
                    return;
                } else {
                    result = Math.max(result, dist[i][j]);
                }
            }
        }
        System.out.println(result);
    }
}
