package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(migratoryBirds(list));
    }

    private static int migratoryBirds(List<Integer> arr) {
        int[] countArr = new int[5];
        for (int bird :
                arr) {
            switch (bird) {
                case 1: {
                    countArr[0]++;
                    break;
                }
                case 2: {
                    countArr[1]++;
                    break;
                }
                case 3: {
                    countArr[2]++;
                    break;
                }
                case 4: {
                    countArr[3]++;
                    break;
                }
                case 5: {
                    countArr[4]++;
                    break;
                }
            }
        }
        return findMax(countArr);
    }

    private static int findMax(int[] countArr) {
        int max = 0, loc = -1;
        for (int i = countArr.length - 1; i > 0; i--) {
            if (countArr[i] >= max) {
                max = countArr[i];
                loc = (i + 1);
            }
        }
        return loc;
    }
}
