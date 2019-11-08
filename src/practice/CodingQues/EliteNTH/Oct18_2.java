package practice.CodingQues.EliteNTH;

import java.util.Scanner;

/* Adeeba
 * Input a String with Multiple Words : Cat , Dog, Mouse, Cat , Lion , Rabbit, Bird , Mouse
 * Print Words that duplicate in the String
 */
//        Cat Dog Mouse Cat Lion Rabbit Bird Mouse
public class Oct18_2 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String[] sArr = s.split(" ");
        int[] counter = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++)
            for (int j = 0; j < i; j++)
                if (sArr[i].equals(sArr[j])) counter[i]++;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0)
                System.out.println(sArr[i]);
        }
    }
}
