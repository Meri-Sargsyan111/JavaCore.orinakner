package homework8;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Առաջին տող";
        String strOb2 = "Երկրորդ տող";
        String strOb3 = "Առաջին տող";
        System.out.println("strOb1-ի երկարությունը՝ " + strOb1.length());
        System.out.println("Սիմվոլ ինդեքս 3-ում՝ " + strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}