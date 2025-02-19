// 유미
package Random.Random1Day9M;

import java.util.Scanner;

public class Q17286 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int yumix = stdin.nextInt();
        int yumiy = stdin.nextInt();

        People people1 = new People(stdin.nextInt(), stdin.nextInt());
        People people2 = new People(stdin.nextInt(), stdin.nextInt());
        People people3 = new People(stdin.nextInt(), stdin.nextInt());

        double distance1 = getdistance(yumix, yumiy, people1, people2, people3);
        double distance2 = getdistance(yumix, yumiy, people2, people1, people3);
        double distance3 = getdistance(yumix, yumiy, people1, people3, people2);
        double distance4 = getdistance(yumix, yumiy, people2, people3, people1);
        double distance5 = getdistance(yumix, yumiy, people3, people2, people1);
        double distance6 = getdistance(yumix, yumiy, people3, people1, people2);

        int mindistance = (int)Math.min(Math.min(Math.min(distance1, distance2),
                Math.min(distance3, distance4)),Math.min(distance5, distance6));

        System.out.println(mindistance);

    }

    static class People {
        int x;
        int y;

        People(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static double getdistance(int yumix, int yumiy, People p1, People p2, People p3) {
        double distance = 0;
        distance += Math.sqrt((yumix - p1.x)*(yumix - p1.x) + (yumiy - p1.y)*(yumiy - p1.y));
        distance += Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
        distance += Math.sqrt((p2.x - p3.x)*(p2.x - p3.x) + (p2.y - p3.y)*(p2.y - p3.y));

        return distance;
    }
}

/*
1번째 입력값 -> 유미의 위치

2,3,4번째 입력값 -> 사람의 위치

ex) (1,1) -> (4,2) :  |(x2 - x1) + (y2 - y1)| root


class people{
    int x;
    int y;
    public people(int x, int y){
        this.x = x;
        this.y = y;
    }

 */

/*
public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int yumix = stdin.nextInt();
        int yumiy = stdin.nextInt();

        People people1 = new People(stdin.nextInt(), stdin.nextInt());
        People people2 = new People(stdin.nextInt(), stdin.nextInt());
        People people3 = new People(stdin.nextInt(), stdin.nextInt());

        double distance1 = getdistance(yumix, yumiy, people1, people2, people3);
        double distance2 = getdistance(yumix, yumiy, people2, people1, people3);
        double distance3 = getdistance(yumix, yumiy, people1, people3, people2);
        double distance4 = getdistance(yumix, yumiy, people2, people3, people1);
        double distance5 = getdistance(yumix, yumiy, people3, people2, people1);
        double distance6 = getdistance(yumix, yumiy, people3, people1, people2);

        int mindistance = (int)Math.min(Math.min(Math.min(distance1, distance2),
                Math.min(distance3, distance4)),Math.min(distance5, distance6));

        System.out.println(mindistance);

    }

    static class People {
        int x;
        int y;

        People(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static double getdistance(int yumix, int yumiy, People p1, People p2, People p3) {
        double distance = 0;
        distance += Math.sqrt((yumix - p1.x)*(yumix - p1.x) + (yumiy - p1.y)*(yumiy - p1.y));
        distance += Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
        distance += Math.sqrt((p2.x - p3.x)*(p2.x - p3.x) + (p2.y - p3.y)*(p2.y - p3.y));

        return distance;
    }
 */