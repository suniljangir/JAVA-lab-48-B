import java.util.Scanner;
public class New_pattern_loop {
    public static void main(String[] args) {

        System.out.print("Enter any Number .......");
        Scanner scn2 = new Scanner(System.in);
        int input2 = scn2.nextInt();
        System.out.print("Your entered number is______" + input2 + "\n");
        int nr = 2 * input2 - 1;
        int nst = 1;

        // Rows
        int row1 = 1;
        while (row1 <= nr) {

            // Work
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            // Prep
            System.out.println();
            if (row1 <= nr / 2) {
                nst++;
            } else {
                nst--;
            }


            row1++;


        }

    }
}