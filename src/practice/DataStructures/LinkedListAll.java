package practice.DataStructures;

public class LinkedListAll {
    private Node head;

    // TODO: 17-10-2019 Create Driver Switch for UI
    // FIXME: Build These Functions
    public static void main(String[] args) {
        LinkedListAll list = new LinkedListAll();
        insertAtLast(list, 20);
        insertAtLast(list, 2);
        insertAtLast(list, 10);
        insertAtLast(list, 26);
        insertAtBeginning(list, 432);
        insertAtBeginning(list, 91);
        insertAtPosition(list, 543, 2);
/*        insertAtMiddle(list,123);
        deleteFromMiddle(list);
        deleteByKey(list,*//*key*//*3);*/
        deleteFromBeginning(list);
        deleteFromLast(list);
        deleteFromPosition(list, 2);
        printList(list);
        printListFromLast(list.head);
    }

    private static void printListFromLast(Node node) {
        if (node.next != null)
            printListFromLast(node.next);
        System.out.print(node.getData() + " ");
    }

    private static void insertAtPosition(LinkedListAll list, int data, int pos) {
        Node node = list.head;
    }

    private static void deleteFromPosition(LinkedListAll list, int pos) {
        Node node = list.head, prev = null;
        if (node == null) {
            printListEmpty();
        } else {
            if (pos == 0) {
                deleteFromBeginning(list);
            }
            int counter = 0;
            while (node != null) {
                if (counter == pos) {
                    assert prev != null;
                    prev.next = node.next;
                    System.out.println("Node at Position " + pos + " deleted");
                    return;
                } else {
                    prev = node;
                    node = node.next;
                    counter++;
                }
            }
            System.out.println(pos + " not found");
        }
    }

    private static void printListEmpty() {
        System.out.println("List is Empty");
    }

    private static void deleteFromLast(LinkedListAll list) {
        Node secondLastNode = list.head;
        while (secondLastNode.next.next != null) {
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    private static void deleteFromBeginning(LinkedListAll list) {
        if (list.head == null) printListEmpty();
        else {
            list.head = list.head.next;
        }
    }

    private static void printList(LinkedListAll list) {
        Node node = list.head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
    }

    private static void insertAtLast(LinkedListAll list, int data) {
        Node newNode = new Node(data);
        if (list.head == null)
            list.head = newNode;
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    private static void insertAtBeginning(LinkedListAll list, int data) {
        Node newNode = new Node(data);
        if (list.head == null)
            list.head = newNode;
        else {
            newNode.next = list.head;
            list.head = newNode;
        }
    }
}

class Node {
    Node next;
    private int data;

    Node(int data) {
        this.next = null;
        this.data = data;
    }

    int getData() {
        return data;
    }
}
