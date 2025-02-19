// 최대 힙
package UCPC.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q11279 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int n = stdin.nextInt();

        for (int i = 0; i < n; i++) {
            int x = stdin.nextInt();
            if(x > 0) {
                maxheap.add(x);
            }
            if(x == 0) {
                if (maxheap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(maxheap.poll());
                }
            }
        }
    }
}
