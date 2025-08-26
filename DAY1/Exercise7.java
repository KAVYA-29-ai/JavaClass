import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args){

        int[][] arr = new int[3][3];

        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j< arr[i].length ; j++){
                arr[i][j] = (i+1)*(j+1);
            }
        }

        for(int i =0;i<arr.length ;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    
}
}
