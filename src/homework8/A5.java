package homework8;

public class A5 {
    static C createC() {
        return new C();
    }

    class A {
        void showA() {
            System.out.println("Դաս A-ի մեթոդը");
        }
    }

    class B extends A {
        void showB() {
            System.out.println("Դաս B-ի մեթոդը");

        }
    }

  static final class C {
      private C() {
      }

      void showC() {
            System.out.println("Դաս C-ի մեթոդը");
        }

      public void showA() {

      }
      public void showB() {


      }
  }

    class MultilevelDemo {
        public static void main(String[] args) {
            C obj = createC();

            obj.showA();
            obj.showB();
            obj.showC();
        }
    }
}
