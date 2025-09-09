import java.util.*;

class Geeks {
    public static int sumExists(int arr[], int N, int sum) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            int complement = sum - arr[i];
            
            // check if complement is already seen
            if (set.contains(complement)) {
                return 1; // pair found
            }
            
            // store current element
            set.add(arr[i]);
        }
        
        return 0; // no pair found
    }
}
