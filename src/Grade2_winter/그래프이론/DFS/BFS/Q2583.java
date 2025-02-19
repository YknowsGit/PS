// 영역 구하기
package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2583 {

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int board[][] = new int [102][102];
    static boolean vis[][] = new boolean [102][102];
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); // 열 가로
        int n = Integer.parseInt(st.nextToken()); // 행 세로
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int lx = Integer.parseInt(st.nextToken()); // 왼쪽 아래 x 좌표
            int ly = Integer.parseInt(st.nextToken()); // 왼쪽 아래 y 좌표
            int rx = Integer.parseInt(st.nextToken()); // 오른쪽 위 x 좌표
            int ry = Integer.parseInt(st.nextToken()); // 오른쪽 위 y 좌표
            for (int j = lx; j < rx; j++) {
                for (int l = ly; l < ry; l++) {
                    board[j][l] = 1;
                }
            }

        }

        List<Integer> areas = new ArrayList<>();
        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 1 || vis[i][j]) continue;

                num++;
                vis[i][j] = true;

                Queue<Pair> q = new LinkedList<>();
                q.add(new Pair(i, j));
                int area = 0;

                while(!q.isEmpty()) {
                    area++;
                    Pair cur = q.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = cur.x + dx[dir];
                        int ny = cur.y + dy[dir];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if(board[nx][ny] == 1 || vis[nx][ny]) continue;
                        vis[nx][ny] = true;
                        q.add(new Pair(nx, ny));
                    }
                }
                areas.add(area);
            }
        }
        System.out.println(num);
        Collections.sort(areas);
        for (int i = 0; i < areas.size(); i++) {
            System.out.print(areas.get(i) + " ");
        }

    }
}
