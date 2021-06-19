package TCS.DCA_Practice;

/*
* Question Statement
* You have M questions and N seconds to complete a test. Each question has some points and takes some time to solve
* (which will be given as input). Find the maximum mark that can be scored by the student within the given time N.
* Sample test case:

4 // number of questions
10 // Total time to attend the test
1 2 // one mark question – 2 seconds to solve.
2 3 // two mark question – 3 seconds to solve.
3 5 // three mark question – 5 seconds to solve.
4 7 // 4 mark question – 7 seconds to solve.
* */
public class Q1 {
    public static void main(String[] args) {
        int n = 4, h = 10, p = 10;
        int[] marksarr = {0, 6, 4, 2, 8};
        int[] timearr = {0, 4, 6, 2, 7};
        System.out.println(MaximumMarks(marksarr, timearr, h, n, p));
    }

    static int MaximumMarks(int[] marksarr, int[] timearr, int h, int n, int p) {
        int no_of_topics = n + 1;
        int total_time = h + 1;
        int[][] T = new int[no_of_topics][total_time];
        for (int i = 0; i < no_of_topics; i++) {
            T[i][0] = 0;
        }
        for (int j = 0; j < total_time; j++) {
            T[0][j] = 0;
        }
        for (int i = 1; i < no_of_topics; i++) {

            for (int j = 1; j < total_time; j++) {
                if (j < timearr[i]) {

                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = Math.max(marksarr[i] + T[i - 1][j - timearr[i]], T[i - 1][j]);
                }
            }
        }
        int i = no_of_topics - 1, j = total_time - 1;
        int sum = 0;
        while (i > 0 && j > 0) {
            if (T[i][j] == T[i - 1][j]) {

                i--;
            } else {
                sum += timearr[i];
                j -= timearr[i];
                i--;
            }
        }
        int marks = T[no_of_topics - 1][total_time - 1];
        if (marks < p)
            return -1;
        return sum;
    }
}
