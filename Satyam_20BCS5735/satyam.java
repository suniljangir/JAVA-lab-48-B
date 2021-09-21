import java.util.Scanner;
public class satyam {
    public static void main(String[] args){


// Q0           Printing n * in rows only


        System.out.println("Printing n numbers in rows only");
        System.out.print("Enter any Number .......");
        Scanner scn = new Scanner (System.in);
        int input = scn.nextInt();
        System.out.print("Your entered number is______"+input+"\n");
        for(int a=0;a<input;a++) {
        System.out.println("*");
            }

//  Q1     Printing n * in rows and coulm both


        System.out.println("\nPrinting n numbers in rows and coulumn both");
        // Here we have to use whle loop bcz we want to make modify in each steps lets see

        System.out.print("Enter any Number .......");
        Scanner scn1 = new Scanner (System.in);
        int input1 = scn1.nextInt();
        System.out.print("Your entered number is______"+input1+"\n");

        int row = 1;
        while (row<=input1){
            int col=1;
            while(col<=input1){
                System.out.print("*");
                col = col+1;
            }
            System.out.println("");
            row=row+1;

        }

//  Q2    Printing n * in rows and n-1 in coulumn both

        System.out.print("Enter any Number .......");
        Scanner scn2 = new Scanner (System.in);
        int input2 = scn2.nextInt();
        System.out.print("Your entered number is______"+input2+"\n");

        int nst = 1;

        // Rows
           int row1 = 1;
           while (row1<=input2){
        // Work
            int cst=1;
            while (cst <= nst) {
                    System.out.print("*");
                    cst ++;
            }
        // Prep
            System.out.println();
            nst= nst+1;
            row1=row1+1;

        }



//  Q3    Printing n * in rows and n-1 in coulumn both

        System.out.print("Enter any Number .......");
        Scanner scn3 = new Scanner (System.in);
        int input3 = scn3.nextInt();
        System.out.print("Your entered number is______"+input3+"\n");

        int nst1 = input3;

        // Rows
        int row2 = 1;
        while (row2<=input3){
            // Work
            int cst1=1;
            while (cst1 <= nst1) {
                System.out.print("*");
                cst1 ++;
            }
            // Prep
            System.out.println();
            nst1= nst1-1;
            row2=row2+1;

        }


//  Q4    Printing n * in rows and n-1 in coulumn both

        System.out.print("Enter any Number .......");
        Scanner scn4 = new Scanner (System.in);
        int input4 = scn4.nextInt();
        System.out.print("Your entered number is______"+input4+"\n");

        int nsp = input4-1;
        int nst2 = 1;

        // Rows
        int row3 = 1;
        while (row3<=input4) {
            // Work for space
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            // Work for stars
            int cst2 = 1;
            while (cst2 <= nst2) {
                System.out.print("*");
                cst2++;
            }
            // Prep
            System.out.println();
            nst2 = nst2 + 1;
            nsp = nsp - 1;
            row3 = row3 + 1;
        }

        //  Q5    Printing n * in rows and n-1 in coulumn both

        System.out.print("Enter any Number .......");
        Scanner scn5 = new Scanner (System.in);
        int input5 = scn5.nextInt();
        System.out.print("Your entered number is______"+input5+"\n");

        int nsp1 = 0;
        int nst3 = input5;

        // Rows
        int row4 = 1;
        while (row4<=input5) {

            // Work for space
            int csp2 = 1;
            while (csp2 <= nsp1) {
                System.out.print(" ");
                csp2++;
            }
            // Work for stars
            int cst3 = 1;
            while (cst3 <= nst3) {
                System.out.print("*");
                cst3++;
            }
            // Prep
            System.out.println();
            nst3 = nst3 - 1;
            nsp1 = nsp1 + 1;
            row4 = row4 + 1;
        }







    }
    }

