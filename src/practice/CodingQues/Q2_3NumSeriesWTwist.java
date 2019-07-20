package practice.CodingQues;
/*
		○ Find the 15th term of the series?
		○ 0,0,7,6,14,12,21,18, 28
		○ Explanation : In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }
		○ And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }
*/

public class Q2_3NumSeriesWTwist {
    public static void main(String[] args) {
        int num = 15, six, seven, res = 0;
        for (int i = 1, j = 0, k = 0; i <= num; i++) {
            if (i % 2 == 0) {
                six = 6 * j++;
                res = six;
                System.out.printf(" %d ", six);
            }
            if (i % 2 != 0) {
                seven = 7 * k++;
                res = seven;
                System.out.printf(" %d ", seven);
            }
        }
        System.out.println(res);
    }
}
