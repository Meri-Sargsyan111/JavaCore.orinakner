package homework8;

public class Box1 {
    double height;
    double width;
    double depth;

    Box1(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box1(double w, double h, double d){
        height = w;
        width  = h;
        depth  = d;
    }
    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // կոնստրուկտոր՝ խորանարդ ստեղծելու համար
    Box1(double len) {
        width = height = depth = len;
    }

    // ծավալի հաշվարկ
    double volume() {
        return width * height * depth;
    }
}

// ընդլայնված դաս՝ քաշով
class Box2Weight extends Box {
    double weight;

    Box2Weight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBox1Weight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1-ի ծավալը՝ " + vol);
        System.out.println("mybox1-ի քաշը՝ " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("mybox2-ի ծավալը՝ " + vol);
        System.out.println("mybox2-ի քաշը՝ " + mybox2.weight);
    }
}
