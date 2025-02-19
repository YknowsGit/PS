// 기상캐스터
package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10709 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken()); // 행 세로
        int w = Integer.parseInt(st.nextToken()); // 열 가로

        int[][] answer = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                answer[i][j] = -1;
            }
        }

        for (int i = 0; i < h; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < w; j++) {
                if(input[j] == 'c') {
                    answer[i][j] = 0;
                    for (int k = j + 1; k < w; k++) {
                        if (answer[i][k] != 0) {
                            answer[i][k] = answer[i][k - 1] + 1;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

}
/*
0 -1 -1 0
-1 -1 0 -1
-1 -1 -1 -1

0 1 -1 0
-1 -1 0 1
-1 -1 -1 -1

0 1 2 0
-1 -1 0 1
-1 -1 -1 -1


 */