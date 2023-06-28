package DFSAndBFS;

/**
 * DFS 07-05
 * 이진트리순회 (DFS: Depth-First Search)
 */
public class Q01DFSBinaryTreeCircuit {
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    public static void DFS(Node root) {
        if (root == null) { // 제일 말단 노드
            return;
        } else {
//            System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
//            System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
//            System.out.print(root.data + " "); // 후위 순회
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

        DFS(root);
    }

}
/**
 * 전위순회 출력 : 부모 - 왼쪽 - 오른쪽 순서
 * 중위순회 출력 : 왼쪽 - 부모 - 오른쪽 순서
 * 후위순회 출력 : 왼쪽 - 오른쪽 - 부모 순서
 */