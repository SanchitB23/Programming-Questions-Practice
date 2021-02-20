package TCS;

public class LL {
    public static void main(String[] args) {
        NodeLl head = new NodeLl(4);
        head.next = new NodeLl(5);
        printLl(head);
    }

    private static void printLl(NodeLl head) {
        NodeLl n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}

class NodeLl {
    int data;
    NodeLl next;

    NodeLl(int data) {
        this.data = data;
        next = null;
    }
}