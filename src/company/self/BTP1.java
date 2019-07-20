package company.self;

public class BTP1 {
    private Node root;

    public static void main(String[] args) {
        BTP1 tree = new BTP1();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("Max Element = " + tree.findMax(tree.root));
    }

    private int findMax(Node node) {
        if (node == null)
            return 0; //Null
        int res = node.data;

        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
}


class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
