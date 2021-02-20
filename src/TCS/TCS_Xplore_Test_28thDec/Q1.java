package TCS.TCS_Xplore_Test_28thDec;
// From Input String print the Number of characters and number of spaces

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        /*
         * s="sadsad"
         * s.toCha.. = ['s','a'...]
         * */
        int chars = 0, spaces = 0;

        for (char c :
                s.toCharArray()) {
            if (Character.isSpaceChar(c))
                spaces++;
            else
                chars++;
        }

        System.out.println("Number of Characters : " + chars + " and spaces : " + spaces);
    }
}
