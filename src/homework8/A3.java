package homework8;

public class A3 {
    static class A {
        void show() {
            System.out.println("Դաս A-ի show()");
        }
    }

    static class B extends A {
        void show() {
            System.out.println("Դաս B-ի show()");
        }
    }

    static class OverrideDemo {
        public static void main(String[] args) {
            {
                A objA = new A();
                B objB = new B();

                objA.show(); // Դաս A-ի show()
                objB.show(); // Դաս B-ի show()
            }
        }
    }
}
