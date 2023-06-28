package DFSAndBFS;

/**
 * DFS 07-09
 * Tree 말단 노드까지의 가장 짧은 경로
 */
public class Q05DFSShortestPath {
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    public static int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        System.out.println(DFS(0, root));
    }
}
/**
 * DFS 로 최단경로를 풀기 위해서는 다음과 같은 조건이 만족될 때만 사용가능하다.
 * 말단 노드의 왼쪽 또는 오른쪽에 하나의 값이라도 존재하면 안 된다.
 * => 둘 다 있던지, 둘 다 없어야 한다.
 */