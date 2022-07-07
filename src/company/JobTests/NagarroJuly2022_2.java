package company.JobTests;

import java.util.Scanner;

/*
 * Question :
 *   Let A-> 1, B-> 2,..., Z-> 26
 * Given this encoding, find the number of possible decoding
 *
 * Input : a string (121)
 * Output : integer represent number of possible decoding
 * Example : ABA, AU, LA
 * Solution - https://www.geeksforgeeks.org/count-possible-decodings-given-digit-sequence/
 * */

public class NagarroJuly2022_2 {
    static int mod = 1000000007;

    public static void main(String[] args) {
        System.out.println(countWays(new Scanner(System.in).next()));
    }

    // function which returns the number of ways to decode the message
    static int decodeMessage(int[] dp, int s, String str, int n) {
        // an empty string can also form 1 valid decoding
        if (s >= n) return 1;
    /*
        if we have already computed the number of
        ways to decode the substring return the
        answer directly
    */
        if (dp[s] != -1) return dp[s];
        int num, tc;
        num = tc = 0;
        for (int i = s; i < n; i++) {
            // generate the number
            num = num * 10 + ((int) str.charAt(i) - '0');
            // validate the number
            if (num >= 1 && num <= 26) {
        /* since the number of ways to decode any string
                depends on the result of
                how the remaining string is decoded so get the
                number of ways how the rest of the string can
                be decoded
            */
                int c = decodeMessage(dp, i + 1, str, n);
                // add all the ways that the substring
                // from the current index can be decoded
                tc = (tc % mod + c % mod) % mod;
            }
            // leading 0’s or the number
            // generated so far is greater than 26
            // we can just stop the process
            // as it can never be a part of our solution
            else break;
        }
        // store all the possible decodings and return the result
        return (dp[s] = tc);
    }

    static int countWays(String str) {
        int n = str.length();
        // empty string can form 1 valid decoding
        if (n == 0) return 1;
        // dp vector to store the number of ways
        // to decode each and every substring
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = -1;
        // return the result
        return decodeMessage(dp, 0, str, n);
    }
   /* public static int countWays(String s) {
        int n = s.length();
        char[] sArr = s.toCharArray();
        if (n == 0 || (n == 1 && sArr[0] == '0')) return 0;
        return countDecodings(sArr, n);
    }

    private static int countDecodings(char[] chars, int n) {
        if (n == 0 || n == 1) return 1;
        if (chars[0] == '0') return 0;
        int count = 0;
        if (chars[n - 1] > '0') count = countDecodings(chars, n - 1);
        if (chars[n - 2] == '1' || (
                chars[n - 2] == '2' && chars[n - 1] < '7'
        )) count += countDecodings(chars, n - 2);
        return count;
    }*/
}
