// 좌표 압축
// BakingDog 좌표 압축, 중복 제거
package Grade2_winter.이분탐색.LIS.Type.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            list.add(arr[i]);
        }

        // 정렬
        Collections.sort(list);

        // 중복 제거
        // 각 원소들에 대해 자신의 앞에 있는 원소와 자신의 값이 다른 원소만, 살리기
        // => 배열에서 제거 연산을 하는 식으로 구현하면 제거가 O(n)이고 제거가 최대 n-1번 발생할 수 있으니,
        // O(n^2)이 되니까 큰일나고,
        // 새로운 배열을 하나 만든 후에 살아남은 원소만 뒤에 삽입하는 방법으로 구현해야 함.
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i == 0 || !list.get(i).equals(list.get(i-1))) {
                list2.add(list.get(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = Collections.binarySearch(list2, arr[i]);
            sb.append(index).append(" ");
        }
        System.out.print(sb);
    }
}
/*
좌표 압축

입력 값의 범위는 1 ~ 10^9정도로 굉장히 큰데, 그거를 배열 인덱스 처럼 쓰고 싶은 경우,
크기순으로 번호를 0번부터 매기고싶을때, 이런일을 하는게 좌표압축.
 */