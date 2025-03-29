// 수 찾기
// BakingDog 특정한 수를 찾는 문제
package PS_Key_Problems.이분탐색.LIS.Type.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(st.nextToken());
            int index = Arrays.binarySearch(arr, t);
            if(index >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
/*
각 m개의 수에 대해 선형탐색을 한다면 시간복잡도가 O(NM)
이어서 시간초과 발생

반면에 미리 배열A를 정렬해둔 다음 이분탐색을 수행하면 O(nlogn + mlogn)
에 풀이가 가능
nlog n => 정렬에 필요한 시간복잡도
mlog n => 이분탐색에 필요한 시간복잡도

int index = Arrays.binarySearch(array, key);
array: 검색할 정렬된 배열
key: 찾고자 하는 값
 */

/*
직접 binarysearch 함수 구현

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int binarySearch(int[] a, int n, int target) {
        int st = 0;
        int en = n - 1;
        while (st <= en) {
            int mid = (st + en) / 2;
            if (a[mid] < target) {
                st = mid + 1;
            } else if (a[mid] > target) {
                en = mid - 1;
            } else {
                return 1; // 찾았을 때
            }
        }
        return 0; // st > en일 경우
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n]; // 배열을 지역 변수로 선언

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a); // 배열 정렬

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int t = scanner.nextInt();
            System.out.println(binarySearch(a, n, t)); // 배열과 n을 인자로 전달
        }

        scanner.close();
    }
}
 */