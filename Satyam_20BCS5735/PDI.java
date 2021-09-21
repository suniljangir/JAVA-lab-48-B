public class PDI {
    public static void main(String[] args) {
        System.out.println("Printing Decreasing and Increasing From 5");
        PDI(5);
        System.out.println("\n\nPrinting Decreasing and Increasing From 5 with 2 Skip");
        PDISkip(5);

    }

    public static void PDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PDI(n - 1);
        System.out.println(n);
    }
          // Print   Q2     5,3,1,2,4
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


}
