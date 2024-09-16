import java.util.*;

public class BinTreeBasics {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node top = q.remove();
            if (top == null) {
                System.out.println();
                System.out.println("_________");
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            } else {
                System.out.print(top.data + " ");
                if (top.left != null) {
                    q.add(top.left);
                }
                if (top.right != null) {
                    q.add(top.right);
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int lsum = sumOfNodes(root.left);
        int rsum = sumOfNodes(root.right);
        return lsum + rsum + root.data;
    }

    public static int diameter2(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int lDiam = diameter2(root.left);
        int rDiam = diameter2(root.right);
        int selfDiam = lh + rh + 1;
        return Math.max(lDiam, Math.max(rDiam, selfDiam));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info lInfo = diameter(root.left);
        Info rInfo = diameter(root.right);
        int diam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.ht + rInfo.ht + 1);
        int ht = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);

    }
}
