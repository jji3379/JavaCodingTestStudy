package Greedy;

import java.util.*;

/**
 * Greedy 09-05
 * 다익스트라
 */
public class Q05Dijkstra {
    public static class Edge implements Comparable<Edge> {
        public int vex;
        public int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    static int n;
    static int m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public static void solution(int v) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v, 0));
        dis[v] = 0;
        while (!pq.isEmpty()) {
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) {
                continue;
            }
            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pq.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n + 1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }
    }
}
