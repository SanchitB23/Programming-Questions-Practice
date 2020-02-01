package practice.CodingQues.HackerRank;

import java.util.HashMap;
import java.util.Scanner;

//the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        HashMap<Character, Integer> hashMapA = new HashMap<>();

        for (char c :
                a.toLowerCase().toCharArray()) {
            if (hashMapA.containsKey(c)) {
                Integer i = hashMapA.get(c);
                hashMapA.replace(c, ++i);
            } else hashMapA.put(c, 1);
        }

        for (char c :
                b.toLowerCase().toCharArray()) {

            if (!hashMapA.containsKey(c))
                return false;

            if (hashMapA.get(c) == 0) {
                return false;
            }

            if (hashMapA.containsKey(c)) {
                Integer integer = hashMapA.get(c);
                hashMapA.replace(c, --integer);
            }
        }


        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
