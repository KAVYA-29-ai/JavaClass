import java.util.Arrays;

public class Exercise6 {
    
    public static void main(String[] args){


        int[] Array = {7,2,4,9,1};
        System.out.println(Arrays.toString(Array));

        Arrays.sort(Array,0,5);
        System.out.println(Arrays.toString(Array));
        
        int z =  Arrays.binarySearch(Array, 4);
        System.out.println(z);


        /*challenge
        int[] arr = new int[1000];
        for(int i = 0; i<arr.length;i++){
            arr[i] = 1000-i;
        }
        Arrays.parallelSort(arr,0,100);
        System.out.println(Arrays.toString(arr));*/

}
}