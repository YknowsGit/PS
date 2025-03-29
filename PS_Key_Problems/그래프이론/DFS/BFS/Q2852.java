// NBA 농구
package PS_Key_Problems.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2852 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int score1 = 0;
        int score2 = 0;

        int leadTime1 = 0;
        int leadTime2 = 0;

        int leadlastTime = 0;

        int endTime = 48 * 60;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int team = Integer.parseInt(st.nextToken());

            String[] str = st.nextToken().split(":");
            int scoreTime = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);

            if(score1 > score2) {
                leadTime1 +=  scoreTime - leadlastTime;
            } else if(score1 < score2) {
                leadTime2 +=  scoreTime - leadlastTime;
            }

            if(team == 1) {
                score1++;
            } else {
                score2++;
            }

            leadlastTime = scoreTime;
        }

        if(score1 > score2) {
            leadTime1 += endTime - leadlastTime;
        } else if(score1 < score2) {
            leadTime2 += endTime - leadlastTime;
        }

        int min1 = leadTime1 / 60;
        int sec1 = leadTime1 % 60;
        int min2 = leadTime2 / 60;
        int sec2 = leadTime2 % 60;

        System.out.println(String.format("%02d:%02d", min1, sec1));
        System.out.println(String.format("%02d:%02d", min2, sec2));

    }
}
/*
출력
총 농구 시간 48:00

1줄 1번팀이 이기고 있었던 시간
2줄 2번팀이 이기고 있었던 시간

처음 나온 team[i] , team[i]가 몇번 나왔는지 count
또다른 team[i]가 나왔을 때도 count
서로다른  team[i]의 count가 같을 때

처음 나온 team[i]가 이기고 있었던 시간 =

count가 많은 team[i] 48:00 -
 */