import java.util.Scanner;
public class New_pattern_loop18 {
    public static void main(String[] args){

        System.out.print("Enter any Number .......");
        Scanner scn2 = new Scanner(System.in);
        int input2 = scn2.nextInt();
        System.out.print("Your entered number is______" + input2 + "\n");

        int nst = 1;
        int nsp = input2;

        // Rows
        int row1 = 1;
        while (row1 <= input2) {

            //Space Work
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            // Star work
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }

            // Prep
            System.out.println();
            if (row1 <= input2/2) {
                nsp=nsp-1;
                nst=nst+2;
            }
            else {
                nsp=nsp+1;
                nst=nst-2;
            }
            row1++;
        }


    }
}
