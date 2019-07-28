package practice;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        float sum = 0;
        int count = 0;
        float[] numbers = new float[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = s.nextFloat();
        }
        for (int i = num - 1; i >= 0; i--) {
            sum += numbers[i];
            count++;
            if (sum > sum(i, numbers)) {
                System.out.println(count);
                break;
            }
        }
    }

    private static float sum(int end, float[] numbers) {
        float sum = 0;
        for (int i = 0; i < end; i++)
            sum += numbers[i];
        return sum;
    }
}
