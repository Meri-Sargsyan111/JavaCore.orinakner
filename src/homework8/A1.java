package homework8;

public class A1 {
    void callme() {
        System.out.println("callme() մեթոդը դաս A-ից է");
    }
}
class B1 extends A1 {
    void callme() {
        System.out.println("callme()  մեթոդը դաս B-ից է");
    }
}
class C1 extends A1 {
    void callme() {
        System.out.println("callme()  մեթոդը դաս C-ից է");
    }
}
class DispatchDemo {
    public static void main(String[] args) {
        A1 a = new A1();
        B b = new B();
        C c = new C();
    }
}
