

      //   QUESTION (1)    ---------    Taking usser input and saving this in array
    import java.util.*;
    public class Array_Basic02 {
    static Scanner scn = new Scanner(System.in);  //   Global Scanner
    public static void main(String[] args){

    int array [] =takeInput();
    display(array);
    }

    public static int [] takeInput(){           // Function with int return type
        System.out.println("Size  ?");
        int n=scn.nextInt();                    // Using global Scanner

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the value for " + "index ?");
            arr[i]=scn.nextInt();
        }
        return arr;

    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    }
