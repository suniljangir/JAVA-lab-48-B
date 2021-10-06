public class Recursion_First_Index_Search_08 {

    public static void main(String[] args){
        int[] arr={3,8,16,10,7,9,5,86,62};
        System.out.println(firstIndex(arr,0,86));
    }

    public static int firstIndex(int[] arr,int si,int data){
        if(si==arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        else{
            int restAns=firstIndex(arr,si+1,data);
            return restAns;
        }
    }


}
