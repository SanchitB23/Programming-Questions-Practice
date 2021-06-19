package TCS.DCA_Practice;

/*Given a character matrix arr[][] of dimensions 3 * N, consisting of three characters {#, *, . },
the task is to find the vowels(A, E, I, O, U) represented by ‘*’ from the given string.

Input: N = 18

* . * # * * * # * * * # * * * . * .
* . * # * . * # . * . # * * * * * *
* * * # * * * # * * * # * * * * . *

*/

public class Q3 {
    public static void main(String[] args) {

        char[][] arr = {{'*', '.', '*', '#', '*', '*',
                '*', '#', '*', '*', '*', '#',
                '*', '*', '*', '.', '*', '.'},
                {'*', '.', '*', '#', '*', '.',
                        '*', '#', '.', '*', '.', '#',
                        '*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '#', '*', '*',
                        '*', '#', '*', '*', '*', '#',
                        '*', '*', '*', '*', '.', '*'}};

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < arr[0].length; ) {
            if (arr[0][j] == '#') {
                stringBuilder.append("#");
                j++;
                continue;
            } else if (arr[0][j] == '.' && arr[0][j + 2] == '.' && arr[0][j + 1] == '.') {
                j++;
                continue;
            } else if (arr[0][j] == '.' && arr[0][j + 2] == '.' && arr[2][j + 1] == '.')
                stringBuilder.append("A");
            else if (arr[0][j + 1] == '.' && arr[1][j + 1] == '.')
                stringBuilder.append("U");
            else if (arr[1][j] == '.' && arr[1][j + 2] == '.')
                stringBuilder.append("I");
            else if (arr[1][j + 1] == '.')
                stringBuilder.append("O");
            else
                stringBuilder.append("E");
            j += 3;
        }
        System.out.println(stringBuilder);
    }
}
