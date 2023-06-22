package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * DP 10-04
 * 가장 높은 탑 쌓기
 */
public class Q04BuildTallestTower {
    public static int[] dy;

    public static class Brick implements Comparable<Brick> {
        public int s;
        public int h;
        public int w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }

    public static int solution(int n, ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;

        answer = dy[0];
        for (int i = 1; i < arr.size(); i++) {
            int maxH = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > maxH) {
                    maxH = dy[j];
                }
            }

            dy[i] = maxH + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];

        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            arr.add(new Brick(a, b, c));
        }

        System.out.println(solution(n, arr));
    }
}
