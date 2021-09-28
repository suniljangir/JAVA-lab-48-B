import java.util.*;
public class First_Basic01 {
    public static void main(String[] args){
        
// Myself
        int marks []  = {1, 2, 3, 4, 5, 8, 55, 86, 7777, 25698, 45691, 15562545};
        marks[3] = 45;
        marks[1] = 9;
        System.out.println(marks[3]);
        System.out.println(marks[1]);


        // classical way to print all of array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


// Madam
        System.out.println("\n\n");
        int arr []  = null;
        arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        int i = 0, j = 2;
        System.out.println(arr[i] + "," + arr[j]);

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }

        // Swapping
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        System.out.println(arr[i]+ "," + arr[j]);

        // Swapping End


    }
}
