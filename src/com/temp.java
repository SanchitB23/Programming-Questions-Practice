package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//FIXME Optimize
public class temp {
    int x;

    public static void main(String[] args) {
//        hackerEarthQue();
        something();
    }

    private static void something() {
        ArrayList<Float> h = new ArrayList<>();
        char weq = 'A';
        switch (weq) {
            case 'A':
                System.out.println("Congratulations!");
            case 'B':
                System.out.println("Good work");
            case 'C':
                System.out.println("Average");
            case 'D':
                System.out.println("Barely passing");
            case 'F':
                System.out.println("Failed");
        }
        int x = 3;
        double y = 9.1;
        System.out.println(x + y);
        String greeting = "Java World!";
        String w = greeting.replace("a", "A");
        System.out.println(new Random().nextBoolean());
        String name = "Java";
        String language = "Programming";
        String fullName = name + language;
        boolean test = fullName.equals(name + language);
        System.out.println(test);
        char grade = 'E';
        if (grade == 'A') {
            System.out.println("Excellent performer");
        } else if (grade == 'B') {
            System.out.println("Good Performer");
        } else if (grade == 'C') {
            System.out.println("Average Performer");
        } else {
            System.out.println("Below Average Performer");
        }
        for (; ; ) {
            System.out.println("Test For");
        }
    }

    private static void hackerEarthQue() {
        Scanner in = new Scanner(System.in);
//        String x = JOptionPane.showInputDialog("Type a Integer");
        int n = in.nextInt(), k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        int[] temp;
        for (int i = 0; i < n; i++) {
            temp = Arrays.copyOfRange(arr, i, arr.length);
            System.out.println(Arrays.toString(temp));
            int counter = 0;
            for (int value : temp) {
                if (value > k)
                    counter++;
            }
            if (counter == arr[i])
                sum += arr[i];
        }
        System.out.println(sum);
    }
}
