public class Basic__01 {
    public static void main(String[] args) {
        System.out.println("Printing Decreasing From 5");
        PD(5);
        System.out.println("Printing Increasing From 5");
        PI(5);
    }

    public static void PD(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PD(n - 1);
    }

    public static void PI(int n)
    {
        if ( n==0) {
            return;
        }
        PI(n - 1);
            System.out.println(n);
        }

    }

