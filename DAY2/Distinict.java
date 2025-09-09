import java.util.*;

class Solution {
    public static int fun(String s) {
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);  // substring of size 2
            set.add(sub);
        }
        
        return set.size();
    }
}
