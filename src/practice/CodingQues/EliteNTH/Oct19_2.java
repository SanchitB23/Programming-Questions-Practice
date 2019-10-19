package practice.CodingQues.EliteNTH;

import java.util.Scanner;

/*Shivangi
 * Bus Route
 * Cab picks employees from places to Office
 * Office = 0
 * People live left side or right side of the Office
 * Cab Distance to Left and Right is restricted
 * Left = Negative Nos ; Right = Positive Nos
 * Find how many people can it pick?
 * */
public class Oct19_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = scanner.nextInt();
        int[] dist = new int[numOfPeople];
        for (int i = 0; i < numOfPeople; i++)
            dist[i] = scanner.nextInt();
        int maxDist = scanner.nextInt(), count = 0;
        for (int place :
                dist)
            if (Math.abs(place) <= maxDist) count++;
        System.out.println(count);
    }
}
