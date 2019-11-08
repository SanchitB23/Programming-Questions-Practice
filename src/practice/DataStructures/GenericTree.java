package practice.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    Node root;
    private int size = 0;

    public GenericTree() {
        root = constructTree(new Scanner(System.in), null, 0);
    }

    public int getSize() {
        return size;
    }

    public boolean sizeEmpty() {
        return size == 0;
    }

    private Node constructTree(Scanner scan, Node parent, int i) {
        if (parent == null) {
            System.out.println("Enter Root data");
        } else System.out.println("Enter " + (i + 1) + "th term of " + parent.data);
        int data = scan.nextInt();
        Node child = new Node();
        child.data = data;
        size++;
        System.out.println("Enter number of children of " + child.data);
        int numOfGChildren = scan.nextInt();
        for (int j = 0; j < numOfGChildren; j++) {
            Node gChild = constructTree(scan, child, j);
            child.children.add(gChild);
        }
        return child;
    }

    void displayTree() {
        display(root);
    }

    private void display(Node node) {
        StringBuilder string = new StringBuilder(node.data + " -> ");
        for (Node child :
                node.children) {
            string.append(child.data).append(", ");
        }
        string.append(".");
        System.out.println(string);
        for (Node child :
                node.children) {
            display(child);
        }
    }

    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
}
