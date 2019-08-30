package practice.CodingQues.InNotes;

import java.util.Scanner;

/*
* 	1. Take 20 integer inputs from user and print the following:
		a. number of positive numbers
		b. number of negative numbers
		c. number of odd numbers
		d. number of even numbers
        e. number of 0.
* */
public class Q4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int positives = 0, negetives = 0, odds = 0, evens = 0, zeros = 0;

        System.out.println("Enter 20 Numbers");
        for (int i = 0; i < 20; i++)
            arr[i] = scanner.nextInt();

        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) evens++;
            else odds++;
            if (arr[i] > 0) positives++;
            else if (arr[i] < 0) negetives++;
            else zeros++;
        }

        System.out.println(
                "Number of Positive Numbers: " +
                        positives +
                        "\nNumber of Negetive Numbers: " +
                        negetives +
                        "\nNumber of Odd Numbers: " +
                        odds +
                        "\nNumber of Even Numbers: " +
                        evens +
                        "\nNumber of Zeros: " +
                        zeros

        );
    }
}
