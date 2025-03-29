// 드래곤 앤 던전 제출x
package PS_Key_Problems.이분탐색.LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16434 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 방의 개수
        int hatk = Integer.parseInt(st.nextToken()); // 용사의 초기 공격력

        int[][] rooms = new int[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            rooms[i][0] = Integer.parseInt(st.nextToken());
            // t = 1인 경우, 공격력이 a이고 생명력이 h인 몬스터
            // t = 2인 경우, 용사의 공격력을 a만큼 증가, 용사의 체력을 h만큼 회복
            rooms[i][1] = Integer.parseInt(st.nextToken());
            rooms[i][2] = Integer.parseInt(st.nextToken());
        }

        long start = 1;
        long end = Long.MAX_VALUE;
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            if(passDungeon(mid, n, hatk, rooms)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }

        System.out.println(answer);

        // 출력: n번째 방에 있는 용을 쓰러트리기 위한 용사의 최소 k
    }

    public static boolean passDungeon(long hmaxhp, int n, int hatk, int[][] rooms) {
        long hCurhp = hmaxhp;
        long hCuratk = hatk;

        for (int i = 0; i < n; i++) {
            int t = rooms[i][0]; // 몬스터(1) 또는 포션(2)
            int a = rooms[i][1]; // 공격력 또는 포션의 효과
            int h = rooms[i][2]; // 생명력 또는 회복량

            if(t == 1) { // 몬스터일 경우
                long monsteratk = a;
                long monsterhp = h;

                while (monsterhp > 0) {
                    monsterhp -= hCuratk;

                    if(monsterhp <= 0) {
                        break;
                    }

                    hCurhp -= monsteratk;

                    if(hCurhp <= 0) {
                        return false;
                    }
                }
            } else if (t == 2) { // 용사일 경우
                hCuratk += a;
                hCurhp += h;

                if (hCurhp > hmaxhp) {
                    hCurhp = hmaxhp;
                    // 현재 체력 제한
                }
            }
        }
        return true;
    }
}
