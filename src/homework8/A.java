package homework8;

public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    public A() {
    }

    void show() {
        System.out.println("i և j։" + i + " " + j);
    }

    static class B extends A {
        int k;

        B(int a, int b, int c) {
            super(a, b);
            k = c;
        }

        void show() {
            System.out.println("k: " + k);
        }
    }

    class OverrideDemo {
        public static void main(String[] args) {

            B subOb = new B(1, 2, 3);
            subOb.show();
        }
    }
}

