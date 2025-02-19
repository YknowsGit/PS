// 주몽
package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = n - 1;
        int count = 0;

        Arrays.sort(arr);

        while(start < end) {
            if(arr[start] + arr[end] < m) {
                System.out.println("* [debug] st : " + start + " ed : " + end);
                start++;
            } else if(arr[start] + arr[end] > m) {
                System.out.println("* [debug] st : " + start + " ed : " + end);
                end--;
            } else if(arr[start] + arr[end] == m) {
                System.out.println("* [debug] st : " + start + " ed : " + end);
                start++;
                end--;
                count++;
            }
        }
        System.out.println(count);
    }
}
