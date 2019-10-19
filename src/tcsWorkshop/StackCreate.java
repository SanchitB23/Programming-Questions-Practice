package tcsWorkshop;


import java.util.Scanner;

class StackWithArrays {
    private int top;
    private int MAX = 1000;
    private int[] a = new int[MAX];


    StackWithArrays() {
        top = -1;
    }

    boolean isEmpty() {
//        System.out.println();
        return (top < 0);
    }

    void push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("StackWithArrays Overflow");
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("StackWithArrays Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("StackWithArrays Underflow");
            return 0;
        } else {
            final int i = a[top];
            return i;
        }
    }
}


public class StackCreate {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StackWithArrays stackWithArrays = new StackWithArrays();

        int loop = 1;

        do {
            System.out.println("1.Push\t2.Pop\t3.Peek");
            int response = scanner.nextInt();
            switch (response) {
                case 1:
                    System.out.println("Enter intput to push");
                    int x = scanner.nextInt();
                    stackWithArrays.push(x);
                    break;
                case 2:
                    System.out.println("Popped number is : " + stackWithArrays.pop());
                    break;
            }


            System.out.println("Continue? (1/0)");
            loop = scanner.nextInt();
        } while (loop == 1);
    }
}
