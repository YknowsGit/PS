// 숫자 카드 2
// BakingDog 특정한 수가 몇개 있는지 찾는 문제
package PS_Key_Problems.이분탐색.LIS.Type.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816  {

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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(st.nextToken());

            sb.append(upper_idx(arr, t, n) - lower_idx(arr, t, n)).append(" ");
        }
        System.out.println(sb);

    }

    static int lower_idx(int[] arr, int target, int len) {
        int st = 0;
        int end = len;

        while(st < end) {
            int mid = (st + end) / 2;
            if(arr[mid] >= target) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }

    static int upper_idx(int[] arr, int target, int len) {
        int st = 0;
        int end = len;

        while(st < end) {
            int mid = (st + end) / 2;
            if(arr[mid] > target) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
}
/*
오름차순 순서가 유지되는 제일 왼쪽 인덱스와
오른쪽 인덱스의 차이가 해당 배열에서 그 수의 등장 횟수

삽입할수 있는 위치는 0 ~9 가아니라 0~ 10 임을 유의해야 함.

1. 가장 왼쪽의 위치를 구하는 과정
st(0번인덱스), mid(st+end/2), end(10번인덱스)
A[mid]와 10을 비교

A[mid](16) > 10
=> 10이 들어갈 수 있는 가장 왼쪽 위치는 mid 이하
=> en = mid 로 변경

10이 들어갈 수 있는 가장 왼쪽위치는
배열안에 10이 있다면 10이 최초로 등장하는 위치이고,
10이 없다면 10보다 큰 수가 최초로 등장하는 위치

mid = (st+end) / 2
A[mid](6) < 10
=> 10이 들어갈수 있는 가장 왼쪽 위치는 mid가 될 수 없고,
mid보다 더 큰 인덱스들 중 하나
=> st = mid + 1

mid = (st+end) / 2
A[mid](10) = 10
=> A[mid] > 10 경우와 동일하게
mid가 10이 들어갈 수 있는 가장 왼쪽 위치일수도 있고
mid이하 일 수도 있음.
=> en = mid 로 변경

mid = (st+end) / 2
=> A[mid](10) = 10
=> en = mid 로 변경

st = end가 되어서 가능한 후보가 1개가 된 순간,
10이 들어갈 수 있는 가장 왼쪽위치가 3번째라는 것을 알 수 있음

정리
A[mid] >= target => en = mid
A[mid] < target => st = mid + 1

구현
st와 end가 일치하지 않을 때 까지 while 반복,
end의 시작점을 len이란 것을 주의해야 함

2. 가장 오른쪽 위치를 구하는 과정
A[mid] > target => en = mid
A[mid] <= target => st = mid + 1
=> 가장 오른쪽 위치는 target보다 큰 수가 최초로 나온
위치 이기 때문에  A[mid] = target일때 구간 변경



 */