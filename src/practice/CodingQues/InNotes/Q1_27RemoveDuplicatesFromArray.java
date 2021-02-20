package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_27RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = Integer.parseInt(scanner.next());
        int[] arr = new int[size];
        ArrayList<Integer> noDuplicates = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) arr[i] = Integer.parseInt(scanner.next());
        for (int element :
                arr)
            if (!noDuplicates.contains(element)) noDuplicates.add(element);
        System.out.println(noDuplicates);
    }
}
