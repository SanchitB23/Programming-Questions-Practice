package practice.CodingQues.CodeChef.OCT19B;

import java.util.Scanner;

// FIXME: 09-10-2019 Run Time Error
class S10E {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int _testCases = scanner.nextInt();
        for (int i = 0; i < _testCases; i++)
            System.out.println(theGoodDays(_testCases));
        scanner.close();
    }

    private static int theGoodDays(int cases) {
        int num = scanner.nextInt(), goodDays = 1;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++)
            arr[i] = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if (i - 5 >= 0)
                if (arr[i] < arr[i - 1] && arr[i] < arr[i - 2] && arr[i] < arr[i - 3] && arr[i] < arr[i - 4] && arr[i] < arr[i - 5])
                    goodDays++;
        }
        return goodDays;
    }
}
