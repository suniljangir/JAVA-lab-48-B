public class Recursion_Factorial_04 {
    public static void main(String[] args){
       System.out.println(Fact(4));
    }

    public static int Fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1=Fact(n-1);
        int fn = n*fnm1;
        return fn;

    }
}