// 유기농 배추
package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1012 {

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board = new int[52][52];
    static boolean[][] vis = new boolean[52][52];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken()); // 가로
            int n = Integer.parseInt(st.nextToken()); // 세로
            int k = Integer.parseInt(st.nextToken()); // 배추 위치

            // 보드 초기화
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    board[j][l] = 0;
                    vis[j][l] = false; //***방문횟수 초기화***
                }
            }

            // 배추 위치 설정
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            int cabbage = 0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (board[j][l] == 1 && !vis[j][l]) {
                        cabbage++;

                        Queue<Pair> q = new LinkedList<>();
                        q.add(new Pair(j, l));
                        vis[j][l] = true;

                        while (!q.isEmpty()) {
                            Pair cur = q.poll();

                            for (int dir = 0; dir < 4; dir++) {
                                int nx = cur.x + dx[dir];
                                int ny = cur.y + dy[dir];
                                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                                if (vis[nx][ny] || board[nx][ny] != 1) continue;
                                vis[nx][ny] = true;
                                q.add(new Pair(nx, ny));
                            }
                        }

                    }
                }
            }
            System.out.println(cabbage);

        }

    }
}
