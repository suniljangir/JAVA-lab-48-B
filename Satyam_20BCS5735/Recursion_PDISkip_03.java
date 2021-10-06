public class Recursion_PDISkip_03 {
    // Q2 Print  this  -     5,3,1,2,4
    public static void PDISkip(int n) {
        if (n == 0) {
            return;
        }
        if(n%2==1){
            System.out.println(n);
        }

        PDISkip(n - 1);
        if(n%2==0){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\nPrinting Decreasing and Increasing From 5 with 2 Skips");
        PDISkip(5);
    }




}
