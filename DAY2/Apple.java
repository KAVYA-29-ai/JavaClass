// User function Template for Java

import java.util.*;

class Solution {
    public int minimumApple(int[] arr) {
        // Use HashSet to store unique persons
        HashSet<Integer> set = new HashSet<>();
        
        for (int person : arr) {
            set.add(person); // duplicate automatically ignored
        }
        
        // Number of unique persons = minimum apples required
        return set.size();
    }
}
