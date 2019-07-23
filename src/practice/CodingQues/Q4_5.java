package practice.CodingQues;

import java.util.Scanner;

/*
* 	5. Write a program to check if elements of an array are same or not it read from front or back. E.g.-
		a. 2	3	15	15	3	2
* */
public class Q4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arInts = new int[size];
        boolean flag = true;
        for (int i = 0; i < size; i++)
            arInts[i] = scanner.nextInt();

        for (int i = 0; i < size / 2; i++)
            if (arInts[i] != arInts[size - 1 - i]) {
                flag = false;
                break;
            }
        System.out.println(flag);
    }
}
