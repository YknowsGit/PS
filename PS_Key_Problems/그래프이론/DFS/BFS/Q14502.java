// 연구소
package PS_Key_Problems.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14502 {

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean vis[][] = new boolean[9][9];
    static int[][] board = new int[9][9];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); // 가로 열
        int n = Integer.parseInt(st.nextToken()); // 세로 행

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0)); // 00이 아니라 board[][] == 2에서 시작해야함)


        // BFS로 바이러스 확산
        while(!q.isEmpty()) {
            Pair cur = q.poll();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(board[nx][ny] == 2 || vis[nx][ny]) continue;
                vis[nx][ny] = true;
                q.add(new Pair(nx, ny));
            }
        }


    }
}
/*
0은 빈칸
1은 벽   => 새로운 벽 3개를 세워 안전영역의 최대크기 출력
2는 바이러스

2에서 bfs탐색 시작
** 벽 세우고,
남은 board[][] = 0 이 되는 칸의 개수 출력

** 가능한 위치의 벽 3개 배치
=> 어떻게 벽을 배치해야 안전영역(0)이 최대가 될 수 있을지?
=> 어떻게 벽을 배치하는 코드짤수 있을지?


 */