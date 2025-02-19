package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1325 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 그래프 구성
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[b].add(a); // b가 a를 신뢰하므로 a -> b
        }

        Queue<Integer> q = new LinkedList<>();
    }
}
/*
그래프 BakingDog 강의 다시 듣기

"""""인접 그래프 구현""""""" 하는 방식 다시 복습하기




5 -> 4 : 5는 4를 신뢰한다
3 -> 1 : 3은 1을 신뢰한다
3 -> 2 : 3은 2를 신뢰한다
4 -> 3 : 4는 3을 신뢰한다
5 -> 3 : 5는 3을 신뢰한다.


1,2 => 탐색(신뢰도) 배열 없음
3 => 1, 2 탐색
4 => 3(, 1, 2) 탐색
5 => 4(, 3, (, 1 ,2)) 탐색

가장 많은 신뢰를 받은 컴퓨터가 해킹해야 가장 많은 컴퓨를 해킹 가능

 */
