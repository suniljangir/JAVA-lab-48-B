import java.util.*;
public class Array_BinarySearch05 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] Args) {
        //   int[] array=takeInput();
        //   display(array);
        //   System.out.println(maxInArray(array,30));
        int[] array={10,20,30,55,8,90,56,100};
        //System.out.println(linearSearch(array,30));
        System.out.println(binarySearch(array,30));
    }


    public static  int[] takeInput(){
        System.out.println("Size  ?");
        int n=scn.nextInt();

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
    public static int maxInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int linearSearch(int[] arr,int item){
        for(int i=0; i<arr.length;i++){
            if (arr[i]==item) {
                return i;
            }
        }
        return-1;

    }


  public static int binarySearch(int[] arr,int item)  {
        int lo=0;
        int hi=arr.length-1;

        while(lo<= hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<item){
                lo=mid+1;
            }else if(arr[mid]>item){
                hi=mid-1;
            }else {
                return mid;
            }
        }
             return -1;
  }
}

