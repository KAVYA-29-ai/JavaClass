import java.util.*;

class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int minFreq = n + 1; 
        int maxNum = Integer.MIN_VALUE;
        
        for (int num : freqMap.keySet()) {
            int f = freqMap.get(num);
            if (f < minFreq || (f == minFreq && num > maxNum)) {
                minFreq = f;
                maxNum = num;
            }
        }
        
        return maxNum;
    }
}
