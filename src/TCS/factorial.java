package TCS;

public class factorial {

    private static int sum = 1;
    private static final int[] store = new int[100];//nt[100];

    private static int factDynamic(int n) {
        if (n > -1) {
            store[0] = 1;
            if (store[n] == 0) {
                store[n] = n * fact(n - 1);
            }
        }
        return store[n];

    }

    private static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    private static int factRecursion(int n) {
        if (n != 0) {
            sum *= n;
            n -= 1;
            factRecursion(n);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factRecursion(9));
        System.out.println(factDynamic(9));
        System.out.println(fact(9));
    }
}
