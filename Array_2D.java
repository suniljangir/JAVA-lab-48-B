public class Array_2D {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[8][8];
        arr[0][0] = 10;
        arr[0][1] = 15;
        arr[0][2] = 16;
        arr[0][3] = 12;
        arr[0][4] = 11;
        arr[0][5] = 18;
        arr[2][5] = 55;
        arr[1][0] = 10;
        arr[1][1] = 15;
        arr[2][2] = 16;
        arr[5][3] = 12;
        arr[4][4] = 11;
        arr[3][5] = 18;
        arr[2][5] = 55;
        arr[1][6] = 10;
        arr[2][1] = 15;
        arr[5][2] = 16;
        arr[6][3] = 12;
        arr[4][4] = 11;
        arr[5][5] = 18;
        arr[2][6] = 55;
        System.out.println(arr[0][0]);
        display(arr);
    }
    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

