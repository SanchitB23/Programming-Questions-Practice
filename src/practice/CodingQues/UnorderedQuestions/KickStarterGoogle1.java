package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;
//inOneNote
public class KickStarterGoogle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        do {
            int d = scanner.nextInt(),s=scanner.nextInt();
            int[] c = new int[s],
                    e = new int[s],
                    a = new int[d],
                    b = new int[d];
            //input
            for (int i = 0; i < s; i++) {
                c[i] = scanner.nextInt(); //coding
                e[i] = scanner.nextInt(); //eating
            }
            for (int i = 0; i < d; i++) {
                a[i] = scanner.nextInt(); //coding
                b[i] = scanner.nextInt(); //eating
            }
            //process
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < s; j++) {
                    int tempC,tempE,perc;
                    if(b[i]==e[i]){
                        tempE=e[i];
                        tempC=0;
                    }
                }
            }




            test_cases--;
        } while (test_cases!=0);
    }
}
