package company.tcsWorkshop;

import java.util.Scanner;

interface calssmane {

}

public class Q1 {
    static public void main(String[] args) {
        System.out.println("Enter 5 nos");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a1, a2), Math.max(a3, a4)), a5));
    }
}