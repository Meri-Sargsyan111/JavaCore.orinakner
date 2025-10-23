package homework8;

public class A4 {
    static class A {
        void callme() {
            System.out.println("callme() դաս A-ից");
        }
    }

    static class B extends A {
        void callme() {
            System.out.println("callme() դաս B-ից");
        }
    }

    static class C extends A {
        void callme() {
            System.out.println("callme() դաս C-ից");
        }
    }

    class DispatchDemo {
        public static void main(String[] args) {
            A a;
            a = new A();
            a.callme();

            a = new B();
            a.callme();

            a = new C();
            a.callme();
        }
    }
}
