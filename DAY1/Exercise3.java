import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        // Task 1: Creating a jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];

        // Task 2: Fill it with sequential numbers.
        int num = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = num;
                num++;
            }
        }

        // Printing the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
    }
}