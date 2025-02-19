// 영화감독 숌
package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while(count != n) {
            num++;

            if(Integer.toString(num).contains("666")) {
                count++;
            }

        }
        System.out.println(num);
    }
}
/*
종말의 수란 어떤 수에 6이 적어도
3개 이상 연속으로 들어가는 수

n = 1  2     3      4    5     6   7   8   9
   666 1666  2666 3666 4666  5666 6660  6661 6662
 */