package Random.Random1Day9M;

import java.io.*;


public class Q1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long s = Long.parseLong(br.readLine());
        long start = 0; // 시작값 start = 0
        long count = 0; // 횟수 count = 0

        while (s > start) {
            count += 1;
            start += count;
        }

        if(s == start) {
            System.out.println(count);
        } else {
            System.out.println(count-1);
        }

        bw.flush();
        bw.close();
    }
}



/*
런타임 에러가 나오는 이유??

-> 주어진 입력값에 대한 조건 항상 파악해야함

-> 첫째 줄에 자연수 S 최악 조건 범위 (4,294,967,295)

-> 어떤 Type으로 입력값을 받을지(Long) ※주의※

+a)

시간초과가 나오는 이유??

-> 시간초과 나기때문에 입려, 출력값
BufferdReader, BufferdWriter로 받을 것


 */