package practice.CodingQues.UnorderedQuestions;

//Write a code to find out all positive whole numbers x & y satisfying the equation x*y = 130
public class XandYRelation {
    public static void main(String[] args) {
        for (int i = 1; i < 131; i++) {
            for (int j = 1; j < 131; j++) {
                if (i * j == 130) {
                    System.out.println("Res: " + i + "," + j);
                }
            }
        }
    }
}
