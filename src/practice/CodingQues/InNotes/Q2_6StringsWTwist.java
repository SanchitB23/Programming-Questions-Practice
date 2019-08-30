package practice.CodingQues.InNotes;
/*
 		○ Link to this Questions
		○ 1. The program will receive 3 English words inputs from STDIN
			§ These three words will be read one at a time, in three separate line
			§ The first word should be changed like all vowels should be replaced by %
			§ The second word should be changed like all consonants should be replaced by #
			§ The third word should be changed like all char should be converted to upper case
			§ Then concatenate the three words and print them
		○ Other than these concatenated word, no other characters/string should or message should be written to STDOUT
		○ For example if you print how are you then output should be h%wa#eYOU.
		○ You can assume that input of each word will not exceed more than 5 chars
*/

import java.util.Scanner;

public class Q2_6StringsWTwist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Words in a line");
        String string = scanner.nextLine();
        int flag = 0;
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        String yStr, resStr;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                flag++;
                continue;
            }
            switch (flag) {
                case 0:
                    if (isVowel(string.charAt(i))) x.append('%');
                    else x.append(string.charAt(i));
                    break;
                case 1:
                    if (!isVowel(string.charAt(i))) x.append('#');
                    else x.append(string.charAt(i));
                    break;
                case 2:
                    y.append(string.charAt(i));
                    break;
            }
        }
        yStr = y.toString().toUpperCase();
        resStr = x.toString().concat(yStr);
        System.out.println(resStr);
    }

    private static boolean isVowel(char charAt) {
        return charAt == 'a' || charAt == 'e' ||
                charAt == 'i' || charAt == 'o' ||
                charAt == 'u' || charAt == 'A' ||
                charAt == 'E' || charAt == 'I' ||
                charAt == 'O' || charAt == 'U';
    }
}
