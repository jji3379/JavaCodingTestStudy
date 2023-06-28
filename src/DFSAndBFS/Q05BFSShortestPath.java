package DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS 07-10
 * Tree 말단 노드까지의 가장 짧은 경로
 */
public class Q05BFSShortestPath {
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    public static int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }

                if (cur.lt != null) {
                    q.offer(cur.lt);
                }

                if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        System.out.println(BFS(root));
    }
}