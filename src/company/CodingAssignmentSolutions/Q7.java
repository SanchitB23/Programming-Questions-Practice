package company.CodingAssignmentSolutions;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(9));
    }

    private static int numberOfSteps(int numberOfStairs) {
        if (numberOfStairs == 1 || numberOfStairs == 2) {
            return numberOfStairs;
        }
        if (numberOfStairs == 3) {
            return 4;
        }
        return
                (
                        numberOfSteps(numberOfStairs - 1) +
                                numberOfSteps(numberOfStairs - 2) +
                                numberOfSteps(numberOfStairs - 3)
                );
    }
}

//todo Use Cache here (Dynamic Programming)


/*
 * max
 * i -> max
 * for i
 *   str i
 *
 * 1 1 1 1 1
 * 1 1 1 2
 * 1 1 3
 * 1 1 2 1
 * 1 3 1
 * 1 2 1 1
 * 1 2 2
 * 2 1 1 1
 * 2 2 1
 * 2 1 2
 * 2 3
 * 3 1 1
 * 3 2
 * */
