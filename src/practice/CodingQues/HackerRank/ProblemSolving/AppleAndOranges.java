package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Scanner;

public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(), end = scanner.nextInt();
        int treeA = scanner.nextInt(), treeO = scanner.nextInt();
        int numA = scanner.nextInt(), numO = scanner.nextInt();
        int[] apples = new int[numA], oranges = new int[numO];
        for (int i = 0; i < numA; i++) {
            apples[i] = scanner.nextInt();
        }
        for (int i = 0; i < numO; i++) {
            oranges[i] = scanner.nextInt();
        }
        countApplesAndOranges(start, end, treeA, treeO, apples, oranges);
    }

    private static void countApplesAndOranges(int start, int end, int treeA, int treeO, int[] apples, int[] oranges) {
        int fallA = 0, fallB = 0;
        for (int apple : apples)
            if (apple + treeA >= start && apple + treeA <= end)
                fallA++;
        for (int orange : oranges)
            if (orange + treeO >= start && orange + treeO <= end)
                fallB++;
        System.out.println(fallA);
        System.out.println(fallB);
    }

//    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
///*
//    s: integer, starting point of Sam's house location.
//    t: integer, ending location of Sam's house location.
//    a: integer, location of the Apple tree.
//    b: integer, location of the Orange tree.
//    apples: integer array, distances at which each apple falls from the tree.
//    oranges: integer array, distances at which each orange falls from the tree.
//*/
//
//    }
}
