import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {
        
        // Task 1: Dynamic Array Initialization
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * i;
        }
        System.out.println("Dynamic Array (Dynamic Initialization): " + Arrays.toString(dynamicArray));
        
        // Task 2: Static Array Initialization
  
        int[] staticArray = {10, 20, 30, 40, 50};
        System.out.println("Static Array (Static Initialization): " + Arrays.toString(staticArray));
    }
}