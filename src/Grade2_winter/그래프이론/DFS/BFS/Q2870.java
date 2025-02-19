// 수학숙제
package Grade2_winter.그래프이론.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> numbers = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if(Character.isDigit(c)) {
                    sb.append(c); // 숫자인 경우 sb에 추가
                } else {
                    if(sb.length() > 0) {
                        // 숫자가 끝난 경우, 리스트에 추가하고
                        numbers.add(sb.toString());
                        sb = new StringBuilder();
                        // sb 초기화
                    }
                }
            }
            // 문자열 끝에 숫자가 있다면, 해당 숫자는 다음 문자가 없기 때문에
            // 숫자가 끝났다는 판단이 불가함으로 다음 조건문 추가하여
            // ※ 그동안 sb에 쌓여 있던 숫자를 리스트에 추가
                if(sb.length() > 0) {
                    numbers.add(sb.toString());
                    sb = new StringBuilder();
                // sb 초기화
            }
        }

        List<Long> sortnumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            sortnumbers.add(Long.parseLong(numbers.get(i)));
        }

        Collections.sort(sortnumbers);

        for (int i = 0; i < sortnumbers.size(); i++) {
            System.out.println(sortnumbers.get(i));
        }
    }
}
