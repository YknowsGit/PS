package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class REVIEW {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/*
4*4 => 쪼개기 4*2 조각 둘 1번
4*2 조각 두개 => 쪼개기 4*1 조각 넷 2번
4*1 조각 네개 => 쪼개기 => 2*1 조각 여덟 4번
2*1 조각 여덟개 => 쪼개기 => 1*1 조각 두개 8번
15번걸림

2*2 => 쪼개기 => 2*1 조각 두개
2*1 조각 두개 => 쪼개기 => 1*1 조각 두개
3번걸림
 */