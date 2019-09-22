package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;

public class CustomBaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to Convert");
        String num = scanner.next();
        System.out.println("Enter Current Base of the Number");
        int cBase = scanner.nextInt();
        System.out.println("Enter the resultant Base");
        int resBase = scanner.nextInt();
        System.out.println(Integer.toString(Integer.parseInt(num, cBase), resBase));
    }
}
