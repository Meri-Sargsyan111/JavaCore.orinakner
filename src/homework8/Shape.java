package homework8;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Շրջան");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Քառակուսի");
    }
}

class TestShapes {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
