package practice.CodingQues.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String regex = "[ !,?._'@]";
        String[] str = s.split(regex);
//        System.out.println(str.length - 1);
        int count = 0;
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (String ch : str) {
            ch = ch.trim();
            if (ch.length() < 1) {
                continue;
            }
            count++;
            stringArrayList.add(ch);
        }
        scan.close();
        System.out.println(count);
        for (String string :
                stringArrayList) {
            System.out.println(string);
        }
    }
}
// He is a very very good boy, isn't he?