// 수 찾기
package Random.Random1Day9M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Q1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int m = Integer.parseInt(input[1]);
        ArrayList<String> arrays = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if(set.contains(str)) {
                arrays.add(str);
            }
        }

        System.out.println(arrays);
    }
}
