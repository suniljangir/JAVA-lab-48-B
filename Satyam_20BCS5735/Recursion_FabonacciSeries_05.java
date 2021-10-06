public class Recursion_FabonacciSeries_05 {
    public static void main(String[] args){
        System.out.println(Fib(7));
    }

    public static int Fib(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 0) {
            return n;
        }

        int fnm1=Fib(n-1);
        int fnm2=Fib(n-2);
        int fn = fnm1+fnm2;
        return fn;

    }
}
