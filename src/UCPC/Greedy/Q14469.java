// 소가 길을 건너간 이유3
package UCPC.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q14469 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        ArrayList<Pair> info = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int first = stdin.nextInt();
            int second = stdin.nextInt();
            info.add(new Pair(first, second));
        }

        Collections.sort(info);


        int Start_time; // 2
        int Ing_time;   // 1

        // 2, Start_time > current_time
        int Current_time = 0;
        for (int i = 0; i < n; i++) {
            int Waiting_time = 0;

            Start_time = info.get(i).first;

            if(Start_time > Current_time) {
                Waiting_time = Start_time - Current_time;
            }

            Ing_time = info.get(i).second;
            Current_time += Waiting_time + Ing_time;
        }
        System.out.println(Current_time);
    }

    static class Pair implements Comparable<Pair> {

        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.first, o.first);
        }

    }
}

/*
그리디
=> 일단 정렬하자!


 */