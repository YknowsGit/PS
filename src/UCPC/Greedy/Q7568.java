package UCPC.Greedy;

import java.util.ArrayList;
import java.util.Scanner;
public class Q7568 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        ArrayList<Pair> info = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int first = stdin.nextInt();
            int second = stdin.nextInt();
            info.add(new Pair(first, second));
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;      // 등수 초기화
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }

                if (info.get(i).first < info.get(j).first &&
                        info.get(i).second < info.get(j).second) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
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

// 키와 몸무게가 모두 커야만 덩치가 더 크다고할수있음.
// 키 -> arr[i][1], 몸무게 -> arr[i][0]
