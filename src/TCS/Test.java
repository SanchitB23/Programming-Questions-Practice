package TCS;

public class Test extends Base {
    /*private static void method() {
        System.out.println("Called");
    }

    public static void main(String[] args) {
//        method();
//    Test test = new Test();
//    test.method();
        System.out.println((3&5)+"dsd"+(3|5));
    }*/
}

class Base {
    static final Integer i1 = 1;
    final Integer i2 = 2;
    Integer i3 = 3;

    public static void main(String[] args) {
        final Integer i4 = 4;
        Integer i5 = 5;

        class Inner {
            final Integer i6 = 6;
            final Integer i7 = 7;

            Inner() {
                System.out.println(i6 + i7);
            }
        }

/*        boolean a = false;
        if (a = true)
            System.out.println("dfdsf");
        else
            System.out.println("Hello");*/
    }

}