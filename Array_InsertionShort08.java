import java.util.Scanner;
public class Array_InsertionShort08 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

//   int[] array=takeInput();
        //   display(array);
        //   System.out.println(maxInArray(array,30));
        //  int[] array=
        //System.out.println(linearSearch(array,30));
        //  System.out.println(binarySearch(array,30));
        int[] arr = {99,88,77,66,55,10,20,30,55,8,90,56,100};
        //  bubbleSort(arr);
        insertionSort(arr);
        display(arr);
    }

    public static int[] takeInput() {
        System.out.println("Size  ?");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for " + "index ?");
            arr[i] = scn.nextInt();

        }
        return arr;

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;

    }
    public static int binarySearch(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < item) {
                lo = mid + 1;
            } else if (arr[mid] > item) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
    public static void bubbleSort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
    public static void selectionSort(int[] arr){
        for (int counter=0; counter<arr.length-1;counter++){
            int min=counter;
            for(int j=counter+1;j<=arr.length-1;j++){
                if (arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[counter];
            arr[counter]=temp;
        }

    }

    public static void insertionSort(int[] arr){
        for(int counter=1;counter<=arr.length-1;counter++){
            int val=arr[counter];

            int j=counter-1;
            while(j>=0 && arr[j]>val){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
}
