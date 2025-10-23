package homework8;

public class A6 {
        void A() {
            System.out.println("Կոնստրուկտոր A");
        }
    }

    class B extends A {
        B() {
            System.out.println("Կոնստրուկտոր B");
        }
    }

    class C extends B {
        C() {
            System.out.println("Կոնստրուկտոր C");
        }
    }

    class ConstructorChain {
        public static void main(String[] args) {
            C obj = new C();
        }
    }


