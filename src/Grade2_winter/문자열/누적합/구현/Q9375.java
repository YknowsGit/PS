// 패션왕 신해빈
package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> wear = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();

                /*
                해당 종류의 옷이 HashMap에 있을 경우
                HashMap에 저장되어있던 해당 종류의 개수를 1 증가

                해당 종류의 옷이 HashMap에 없을 경우
                해당 종류와 개수 1을 추가
                 */
                if(wear.containsKey(kind)) {
                    wear.put(kind, wear.get(kind) + 1);
                    // wear.get(kind) 현재 옷 개수 + 1
                    // wear.put(kind, wear.get(kind) + 1) 해당 옷 종류의 개수 1 증가
                } else {
                    wear.put(kind, 1);
                    // wear에 값을 1로 설정하여 새로운 키 - 값 쌍 추가
                }

            }
            int result = 1;

            for (int val : wear.values()) {
                result *= val + 1;
            }

            System.out.println(result - 1);
        }
    }
}

/*
for (int val : wear.values()) {
    result *= val + 1;
    }

for (String key : wear.keySet()) {
    int val = wear.get(key);
    // 현재 키(Key)에 해당하는 값(Value) 가져오기
    result *= (val + 1);
    }

for (int k = 0; k < wear.size(); k++) {
    String key = (String) wear.keySet().toArray()[k]
    // keySet을 배열로 변환하여 키 접근
    int val = wear.get(key);
    // 현재 키(Key)에 해당하는 값(Value) 가져오기
    result *= (val + 1)

 */
