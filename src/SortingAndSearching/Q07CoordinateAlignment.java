package SortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표 정렬
 * 06-07
 */
public class Q07CoordinateAlignment {
    public static class Point implements Comparable<Point> {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 오름 차순
        @Override
        public int compareTo(Point o) {
            // return 은 음수 값이 return 되어야 된다.
            // 오름차순이냐 내림차순이냐에 따라 어떤 값이 앞에 올지 정해진다.
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }

        // 내림 차순
//        @Override
//        public int compareTo(Point o) {
//            if (this.x == o.x) {
//                return o.y - this.y;
//            } else {
//                return o.x - this.x;
//            }
//        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();

            arr.add(new Point(x, y));
        }

        // 위에서 재정의한 compareTo 를 기준으로 정렬된다.
        Collections.sort(arr);

        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
/**
 * 좌표 정렬 => x, y 객체 만들어서 compareTo 재정의
 * Collections.sort() 사용
 * => compareTo 에서 재정의한 방법대로 정렬된다.
 *
 * [ 주의 ] compareTo 는 항상 - 값이 나오도록 해야한다.
 */