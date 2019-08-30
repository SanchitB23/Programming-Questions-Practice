package practice.CodingQues.InNotes;
/*
* 	4. Q. Write a program to count the total number of words of a string and print the count.Input will be a string.  
		a. Input Format: Take a string as Input
		b. Output Format: Output is the integer the number of words counts in a given input string.
		c. Constraints : String not equal to null
		d. Sample Input : String Word Count
Sample Output : 3
* */

import java.util.Scanner;

public class Q4_4WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        String string = scanner.nextLine();
        if (string != null)
            for (int i = 0; i < string.length(); i++)
                if (string.charAt(i) == ' ')
                    count++;
        System.out.println(count);
    }
}
