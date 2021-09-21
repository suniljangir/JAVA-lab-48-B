import java.util.Scanner;
public class patern27 {
    public static void main(String[] args){

        System.out.print("Enter any Number .......");
        Scanner scn2 = new Scanner(System.in);
        int input2 = scn2.nextInt();
        System.out.print("Your entered number is______" + input2 + "\n");
        int nsp =input2 - 1;
        int nst = 1;
        int x;
        // Rows
        int row1 = 1;
        while (row1 <= input2) {
             x=1;
            //Space Work
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("\t");
                csp++;
            }

            //Star Work
            int cst = 1;
            while (cst <= nst) {
                System.out.print(x+"\t");
                if(cst<=nst/2)
                x++;
                else
                    x--;

                cst=cst+1;

            }
            // Prep
            System.out.println();
            nsp--;
            nst=nst+2;
            row1++;
        }


    }
}

