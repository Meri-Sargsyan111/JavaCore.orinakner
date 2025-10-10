package homework;    //break-ի կիրառումը որպես goto-ի «քաղաքակիրթ» ձև
public class BreakExample {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
            third: {
                System.out.println("Մինչ break օպերատորը");
                if (t) break second;}
                System.out.println("Այս տողը չի տպի");
        }
        System.out.println("Այս տողը գակիս է  second բլոկից հետո");

        }
    }
}




