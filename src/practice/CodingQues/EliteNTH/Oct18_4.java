package practice.CodingQues.EliteNTH;

import java.util.Scanner;

/*
 * Find Missing letters between Sender and Receiver
 * Example:
 *   Sender sends : Encyclopedia
 *   Receiver receives : Encclpdia
 *       Print Letters that are missing
 * */
public class Oct18_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senderString = scanner.next();
        String receiverString = scanner.next();
        int j = 0;
        for (int i = 0; i < senderString.length(); i++)
            for (; j < receiverString.length(); )
                if (senderString.charAt(i) == receiverString.charAt(j)) {
                    j++;
                    break;
                } else {
                    System.out.print(senderString.charAt(i) + " ");
                    i++;
                }

    }
}
