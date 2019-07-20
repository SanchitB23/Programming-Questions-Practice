package practice.CodingQues;
//Area of a circle

import java.util.Scanner;

public class Q1_2ArOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius");
        int r = scanner.nextInt();
        System.out.println("Area of Circle = " + (float) Math.pow(r, 2));
//        System.out.printf("Area of Circle = %.0f", (float) Math.pow(r, 2));
    }
}
