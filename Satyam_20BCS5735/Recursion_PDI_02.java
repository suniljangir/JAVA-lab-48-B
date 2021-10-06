public class Recursion_PDI_02 {
    public static void main(String[] args) {
        System.out.println("Printing Decreasing and Increasing From 5");
        PDI(5);
    }

    public static void PDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PDI(n - 1);
        System.out.println(n);
    }

}
