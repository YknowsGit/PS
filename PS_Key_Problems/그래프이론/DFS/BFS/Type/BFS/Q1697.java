// 숨바꼭질
// BakingDog 1차원에서의 BFS
package PS_Key_Problems.그래프이론.DFS.BFS.Type.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dist = new int[100001];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = -1;
        }


        Queue<Integer> q = new LinkedList<>();
        dist[n] = 0;
        q.add(n);

        while(!q.isEmpty()) {
            int cur = q.poll();

            int[] nextLocation = {cur + 1, cur - 1, 2 * cur};
            for (int i = 0; i < nextLocation.length; i++) {
                int next = nextLocation[i];

                if(next < 0 || next > 100000) continue;
                if(dist[next] != -1) continue;
                dist[next] = dist[cur] + 1;
                q.add(next);
            }
        }

        System.out.println(dist[k]);
    }

}
/*
수빈이가 동생을 찾는 가장 빠른 시간

"5" *2 ->
10 -1 ->
9 *2 ->
18 -1 ->
"17" => 총 4번

수빈이가 x에 있다고 할 때 x-1, x+1, x*2로
이동하는 것을 bfs로 처리 하면 됨.
 */