// 최소 힙
package UCPC.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1927 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int n = stdin.nextInt();

        for (int i = 0; i < n; i++) {
            int x = stdin.nextInt();
            if(x > 0) {
                minheap.add(x);
            }
            if(x == 0) {
                if (minheap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(minheap.poll());
                }
            }
        }

    }
}
