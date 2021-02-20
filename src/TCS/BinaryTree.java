package TCS;

public class BinaryTree {
    private static int size = 0;

    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello World");
//        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(a[8]);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>();
        root.setData(5);

        BinaryTreeNode<Integer> l1 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> r1 = new BinaryTreeNode<>();
        l1.setData(2);
        r1.setData(7);

        root.setLeft(l1);
        root.setRight(r1);

        BinaryTreeNode<Integer> l1l2 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> l1r2 = new BinaryTreeNode<>();
        l1l2.setData(1);
        l1r2.setData(3);

        l1.setLeft(l1l2);
        l1.setRight(l1r2);

        BinaryTreeNode<Integer> r1l2 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> r1r2 = new BinaryTreeNode<>();
        r1l2.setData(6);
        r1r2.setData(8);

        r1.setLeft(r1l2);
        r1.setRight(r1r2);
        size = traverse(root);
        System.out.println(size);
    }

    private static int traverse(BinaryTreeNode<Integer> root) {
        if (root != null) {
//            System.out.println("1. "+root.getData());
            traverse(root.getLeft());
            System.out.println(root.getData());
            //Coz this output is sorted we can add the data we get here in a linked list to obtain a sorted linked list from a binary tree
            size++;
            traverse(root.getRight());
//            System.out.println("3. "+root.getData());
        }
        return size;
    }
}
