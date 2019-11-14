package practice.CodingQues.AmazonPrep.OneNoteQues;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Given a linked list of size N.
 * The task is to reverse every k nodes (where k is an input to the function) in the linked list.
 * */
class Q2 {
    Node reverse(Node head, int k) {
        Node prev = null, curr = head, next = null;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null)
            head.next = reverse(next, k);
        return prev;
    }
}

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    private static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }

            int k = sc.nextInt();
            Q2 obj = new Q2();
            Node res = obj.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }

    private static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}