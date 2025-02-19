// 불!
// BakingDog 시작점이 두 종류일 때
package Grade2_winter.완전탐색.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4179 {

    static class Pair {
        int x;
        int y;

        Pair (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static char[][] board = new char[1001][1001];
    static int[][] dist1 = new int[1001][1001];
    static int[][] dist2 = new int[1001][1001];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken()); // 미로 행의 개수, 세로
        int c = Integer.parseInt(st.nextToken()); // 미로 열의 개수, 가로

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dist1[i][j] = -1;
                dist2[i][j] = -1;
            }
        }

        for (int i = 0; i < r; i++) {
            board[i] = br.readLine().toCharArray();
        }

        Queue<Pair> q1 = new LinkedList<>(); // 불 q1
        Queue<Pair> q2 = new LinkedList<>(); // 지훈 q2

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(board[i][j] == 'F') {
                    q1.add(new Pair(i, j));
                    dist1[i][j] = 0; // 불 dist1
                }
                if(board[i][j] == 'J') {
                    q2.add(new Pair(i, j));
                    dist2[i][j] = 0; // 지훈 dist2
                }
            }
        }

        // 불에 대한 bfs
        while(!q1.isEmpty()) {

            Pair cur = q1.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                if(board[nx][ny] == '#' || dist1[nx][ny] >= 0) continue;
                dist1[nx][ny] = dist1[cur.x][cur.y] + 1;
                q1.add(new Pair(nx, ny));
            }
        }

        // 지훈에 대한 bfs
        while(!q2.isEmpty()) {

            Pair cur = q2.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= r || ny < 0 || ny >= c) {
                    System.out.println(dist2[cur.x][cur.y] + 1);
                    return;
                }
                if(board[nx][ny] == '#' || dist2[nx][ny] >= 0) continue;
                if(dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[cur.x][cur.y] + 1) continue;
                // *if(dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[cur.x][cur.y]) continue;
                // => 이 부분 agin
                dist2[nx][ny] = dist2[cur.x][cur.y] + 1;
                q2.add(new Pair(nx, ny));
            }
        }
        System.out.println("IMPOSSIBLE");
    }

}
/*
fire => dist1, q1
jihun => dist2, q2


 */