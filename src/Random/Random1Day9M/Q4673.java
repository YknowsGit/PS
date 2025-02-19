package Random.Random1Day9M;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean check[] = new boolean[10001];
        // -> 1~10000까지의 셀프넘버
        for (int i = 1; i < 10001; i++) {
            int num = function(i);
            // num의 생성자는 i
            if(num < 10001) {
                check[num] = true;
            }// check를 통해 셀프넘버 찾음
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if(!check[i]) {
                sb.append(i).append("\n");
            }
        }
        bw.write(sb+"\n");
        bw.flush();
        bw.close();
    }

    public static int function (int n) {
        int sum = n;
        while(n !=0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}


/*
n을 d(n)에 생성자 라고 함. (n < d(n)) 생성자가 더 작은 값.
ex) 생성자 1개인 경우
33 -> 33 + 3 + 3 = 39

ex) 생성자 2개인 경우
91 -> 91 + 9 + 1 = 101
100 -> 100 + 1 + 0 + 0 = 101
d(n) -> n + n

셀프넘버란?
-> 생성자가 없는 숫자
-> 100보다 작은 셀프 넘버 총 13개
-> 1,3,5,7,9,20,31,42,53,64,75,86,97

나의 접근방법
-> 그러면 셀프넘버를 바로 찾아보자
-> 100보다 큰 셀프 넘버
->


66 66 + 6 + 6 78
67 67 + 6 + 7 80
68 68 + 6 + 8 82
69 69 + 6 + 9 84

70 70 + 7 + 0 77

71 71 + 7 + 1 79
72 72 + 7 + 2 81
73 73 + 7 + 3 83

74 74 + 7 + 4 85
75 75 + 7 + 5 87

76 76 + 7 + 6 89
77 77 + 7 + 7 91
78 78 + 7 + 8 93
79 79 + 7 + 9 95

80 80 + 8 + 0 88
81 81 + 8 + 1 90
82 82 + 8 + 2 92
83 83 + 8 + 3 94



91 91 + 9 + 1 101
92 92 + 9 + 2 103
93 93 + 9 + 3 105


9903 % 10 = 3
9903 / 10 = 990

990 % 10 = 0
990 / 10 = 99

99 % 10 = 9
99 / 10 = 9

9 % 10 =
 */