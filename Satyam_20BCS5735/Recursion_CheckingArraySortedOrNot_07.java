public class Recursion_CheckingArraySortedOrNot_07 {
    public static void main(String[] args){
        int[] arr={3,8,16,10,7,9};
        System.out.println(isSorted(arr,3));
    }

public static boolean isSorted(int[] arr,int si){
    if(si==arr.length-1){
        return true;
    }
    if(arr[si]>arr[si+1]){
        return false;
    }
    else{
        boolean restAns=isSorted(arr,si+1);
        return restAns;
    }
}

}
