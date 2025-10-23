package homework8;

public class Animal {
    void eat() {
        System.out.println("Կենդանին ուտում է");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Շունը հաչում է");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Կատուն մյաու է անում");
    }
}
class HierarchicalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
