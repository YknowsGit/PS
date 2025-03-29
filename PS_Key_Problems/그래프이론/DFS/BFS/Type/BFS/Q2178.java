// 미로 탐색
// BakkingDog 다차원 배열에서의 거리측정

package PS_Key_Problems.그래프이론.DFS.BFS.Type.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static char board[][] = new char[101][101];
    static int dist[][] = new int[101][101];
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // dist배열 초기화 (-1로 초기화 할 시 vis을 쓰지않고 방문여부 확인도 같이 가능)
        // How? => dist값이 -1이면 방문x, -1이 아니면 방문
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0)); // 시작점 설정
        dist[0][0] = 1; // 시작점 거리 1로 설정

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(board[nx][ny] != '1' || dist[nx][ny] >= 0) continue;
                dist[nx][ny] = dist[cur.x][cur.y] + 1;
                q.add(new Pair(nx, ny));
            }
        }

        System.out.println(dist[n-1][m-1]);
    }
}
