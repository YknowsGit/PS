// N번째 큰 수
package UCPC.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q2075 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        int n = stdin.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = stdin.nextInt();

                minheap.add(num);

                if(minheap.size() > n) {
                    minheap.poll();
                }
            }
        }
        System.out.println(minheap.poll());
    }
}