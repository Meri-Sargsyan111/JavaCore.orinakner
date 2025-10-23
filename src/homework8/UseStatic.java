package homework8;

import java.sql.Statement;

public class UseStatic {
    static int a = 3;
    static  int b ;

    static void math(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + x);
    }
    static {
        System.out.println("Static բլոկը կատարվում է․");
        b = a * 4;
    }
    public static void main(String[] args) {
        math(42);
    }
}
