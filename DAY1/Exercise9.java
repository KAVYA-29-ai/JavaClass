import java.util.Arrays;

public class Exercise9 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(arr));

        // reverse with for loop
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}

