package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++)
            arr.add(scanner.nextInt());
        for (int item :
                gradingStudent(arr)) {
            System.out.println(item);
        }
    }

    private static List<Integer> gradingStudent(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();
        for (int grade : grades) {
            if (grade + 3 < 40) {
                res.add(grade);
                continue;
            }
            int temp = grade;
            int j = 0;
            while (grade % 5 != 0) {
                grade++;
                j++;
                if (j == 3) {
                    grade = temp;
                    break;
                }
            }
            res.add(grade);
        }
        return res;
    }
}
