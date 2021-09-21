           //  Question 3 -- Finding max in given int by array
    import java.util.*;
    public class Array_Max03 {
    static Scanner scn=new Scanner(System.in);   // Global Scanner
    public static void main(String[] Args) {
            int[] array=takeInput();             // Calling Function
            display(array);                      // Calling Function
            System.out.println(maxInArray(array));
    }
    public static  int[] takeInput(){           // Function with int return type
        System.out.println("Size  ?");
        int n=scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the value for " + "index ?");
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){       // Function with void
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int maxInArray(int[] arr){    // Function with int return type
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    }
