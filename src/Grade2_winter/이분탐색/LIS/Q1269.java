// 대칭 차집합
package Grade2_winter.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setAminussetB = new HashSet<>(setA);
        HashSet<Integer> setBminussetA = new HashSet<>(setB);

        setAminussetB.removeAll(setB); // => 복사본 setA - setB를 하여 setAminussetB를 만든다.
        setBminussetA.removeAll(setA); // => 복사본 setB - setA를 하여 setBminussetA를 만든다.
        
        setAminussetB.addAll(setBminussetA); // 차집합 A, B의 합집합을 구한다.

        System.out.println(setAminussetB.size());
    }

}
/*
arr => 1, 2, 4
brr => 2, 3, 4, 5, 6

대칭차집합
a-b = {1}
b-a = {3, 5, 6}
=> 총 갯수: 4개


 */