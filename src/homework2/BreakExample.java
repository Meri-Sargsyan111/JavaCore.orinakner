package homework2;   //break-ի կիրառումը ներդրված ցիկլերից դուրս գալու համար

public class BreakExample {


    public static void main(String args[]) {
        outer: for (int i = 0; i < 3; i++) {
        System.out.println(" Շրջանցում " + i + ": ");
        for (int j = 0; j < 100; j++) {
            if (j == 10) break outer;
            System.out.print(j + " ");}
 System.out.println(" Ցիկլերը ավարտված են։ ");
        }
    }
}
