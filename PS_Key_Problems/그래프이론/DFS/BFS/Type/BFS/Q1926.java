// 그림
// BakingDog Flood Fill
// => 페인트 기능으로, 외부 윤곽선을 따라서 구분되는 영역의 색을 한꺼번에 바꾸는 것.
package PS_Key_Problems.그래프이론.DFS.BFS.Type.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1926 {

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board = new int[502][502];
    static boolean[][] vis = new boolean[502][502];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0; // 그림의 최댓값
        int num = 0; // 그림의 수

        // board의 행과 열을 순회
        for (int i = 0; i < n; i++) { // i는 행 인덱스
            for (int j = 0; j < m; j++) { // j는 열 인덱스
                // 현재 위치가 벽(0)인 경우 또는 이미 방문한 경우
                // board[i][j] == 0 현재 위치가 벽(이동 불가)
                // vis[i][j] 이미 bfs탐색을 통해 방문한 위치
                // 위의 조건 중 하나라도 참이면 다음 반복으로 넘어감.
                if(board[i][j] == 0 || vis[i][j]) continue; {
                    // 새로운 그림(연결된 1의 그림)을 발견했으므로 1증가
                    num++;
                    // 현재 위치를 방문 처리
                    vis[i][j] = true;

                    // bfs 탐색을 위한 큐 초기화
                    Queue<Pair> q = new LinkedList<>();
                    // 현재 위치를 큐에 추가
                    q.add(new Pair(i,j));
                    // 현재 그림의 넓이를 저장할 변수 초기화
                    int area = 0;

                    // bfs 탐색 시작
                    while(!q.isEmpty()) {
                        // 그림의 넓이 1증가
                        area++;
                        // 현재 그림의 넓이를 저장할 변수 초기화
                        Pair cur = q.poll();
                        for (int dir = 0; dir < 4; dir++) {
                            int nx = cur.x + dx[dir];
                            int ny = cur.y + dy[dir];
                            // 범위 체크: nx, ny가 board의 유효한 인덱스인지 확인
                            // 범위 밖이라면 다음 반복으로 넘어감.
                            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                            // 방문 여부 및 벽 체크
                            // vis[nx][ny] 이미 방문한 경우(bfs 탐색 완료)
                            // board[nx][ny] != 1 해당 위치가 벽(0)인 경우
                            // 둘 중 하나라도 참이면 다음 반복으로 넘어감.
                            if(vis[nx][ny] || board[nx][ny] == 0) continue;
                            // 새로운 위치 방문 처리
                            vis[nx][ny] = true;
                            // 새로운 위치를 큐에 추가
                            q.add(new Pair(nx,ny));
                        }
                    }
                    max = Math.max(max, area);
                }
            }
        }
        System.out.println(num);
        System.out.println(max);
    }
}
/*
bfs

1. 시작하는 칸을 큐에 넣고 방문했다는 표시를 남김

2. 큐에서 원소를 꺼내어 그 칸에 상하좌우로 인접한 칸에 대해 3번을 진행

3. 해당 칸을 이전에 방문했다면 아무 것도 하지 않고, 처음으로 방문했다면
방문했다는 표시를 남기고 해당 칸을 큐에 삽입

4. 큐의 빌 때까지 2번을 반복

모든 칸이 큐에 1번씩 들어가므로 시간복잡도는 칸이 N개일 때 O(N)
 */

/*
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    static int[][] board = {
        // 여기에 2D 배열 값을 넣으세요.
    };
    static boolean[][] vis = new boolean[502][502]; // 방문 여부
    static int n = 7, m = 10; // n: 행, m: 열
    static int[] dx = {1, 0, -1, 0}; // x 방향 이동
    static int[] dy = {0, 1, 0, -1}; // y 방향 이동

    public static void main(String[] args) {
        Queue<Pair> q = new LinkedList<>();
        vis[0][0] = true; // 시작점 방문 표시
        q.add(new Pair(0, 0)); // 시작점 큐에 추가

        while (!q.isEmpty()) {
            Pair cur = q.poll(); // 큐의 첫 번째 요소 꺼내기
            System.out.print("(" + cur.x + ", " + cur.y + ") -> ");

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir]; // x = 행            x-1, y
                int ny = cur.y + dy[dir]; // y = 열    x, y-1    x, y    x, y+1
                                                               x+1, y
                // 경계값 검사 및 조건
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (vis[nx][ny] || board[nx][ny] != 1) continue;

                vis[nx][ny] = true; // 방문 표시
                q.add(new Pair(nx, ny)); // 새로운 좌표를 큐에 추가
            }
        }
    }

    // Pair 클래스 정의
    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
 */