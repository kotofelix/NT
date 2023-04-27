package Pack1;

public class Task1 {
    public static void main(String[] args) {
        byte b1 = -128;
        short s1 = 32767;
        int a1 = 1001230;
        long l1 = 4147483647L;
        float f1 = 3.22312313f;
        double d1 = 123110.35;
        char ch1 = 'A';
        boolean bol1 = true;

        String stroka = "Hello";

        System.out.println("byte  = " + b1);
        System.out.println("short = " + s1);
        System.out.println("int = " + a1);
        System.out.println("long = " + l1);
        System.out.println("float = " + f1);
        System.out.println("double = " + d1);
        System.out.println("char = " + ch1);
        System.out.println("boolean = " + bol1);
        System.out.println("String = " + stroka);

        int a2 = 1000;
        byte b2 = 2;
        // byte b2 = 1000; мы выходим за гарницы типа byte
        double d2 = 10.35;

        b2 = (byte) a2;
        a2 = (int) d2;

        System.out.println("b2 = " + b2);
        System.out.println("a2 = " + a2);
    }
}
