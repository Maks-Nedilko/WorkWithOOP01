package ua.itea.javabase03;

public class BlockTest {

    int a;
    long b;
    int[] array;
    boolean c;

    public static final double PI = 3.14;

    static int s = 9;
    static String st = "0000";

    {
        System.out.println("IN nonstatic First");

    }

    static {
        System.out.println("FIrst static");

        System.out.println(s);

    }

    BlockTest() {
        System.out.println("Constr");
    }

    {
        System.out.println("IN SECOND nonstatic");
    }

    static {
        System.out.println("IN second static");
    }

    public static void main(String[] args) {
//        NewClass n = new NewClass();
//        System.out.println("*************");
//        NewClass n1 = new NewClass();
        System.out.println(BlockTest.s);
    }

}
