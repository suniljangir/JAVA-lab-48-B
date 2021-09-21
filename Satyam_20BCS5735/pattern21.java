import java.util.Scanner;
public class pattern21 {
    public static void main (String[] args){


        System.out.print("Enter any Number .......");
        Scanner scn2 = new Scanner(System.in);
        int input2 = scn2.nextInt();
        System.out.print("Your entered number is______" + input2 + "\n");

        int nst = 1;
        int nsp =2*input2-3;

        // Rows
        int row1 = 1;
        while (row1 <= input2) {

            // Star Work
            for (int cst=1; cst <= nst; cst++) {
                System.out.print("*");
            }

            // Space Work
            for (int csp=1; csp <= nsp; csp++) {
                System.out.print(" ");
            }
            int cst=1;
                    if(row1==input2){
                        cst=2;
                    }
            // Star Work
            for (; cst<= nst; cst++) {
                System.out.print("*");
            }

            // Prep
            System.out.println();

                nsp = nsp-2;
                nst = nst+1;
                row1=row1+1;
        }

    }
}
