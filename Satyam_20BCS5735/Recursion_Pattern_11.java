public class Recursion_Pattern_11 {
    public static void main(String[] args){
        pattern(5,1,1);
    }

    public static void pattern(int N, int row, int col) {
        if (row > N) {
            return;
        }
        if (col > row) {
            System.out.println();
            pattern(N, row + 1, 1);
            return;
        }
        System.out.print("*");
        pattern(N, row, col+1);
    }
}