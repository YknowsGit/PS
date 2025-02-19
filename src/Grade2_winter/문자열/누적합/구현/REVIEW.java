package Grade2_winter.문자열.누적합.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REVIEW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pattern = br.readLine().split("\\*");

        for (int i = 0; i < n; i++) {
            String filename = br.readLine();

            if(pattern[0].length() + pattern[1].length() > filename.length()) {
                System.out.println("NE");
                continue;
            }

            String front = filename.substring(0, pattern[0].length());
            String back = filename.substring(filename.length() - pattern[1].length(), filename.length());

            if(front.equals(pattern[0]) && back.equals(pattern[1])) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }

        }
    }
}
