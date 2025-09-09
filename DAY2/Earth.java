// User function Template for Java

class alphanumeric {
    public String name;
    public int count;

    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};

class Solution {
    alphanumeric[] sortedStrings(int N, String A[]) {
    Map<String, Integer> freqMap = new HashMap<>();
    for (String s : A) {
        freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
    }
    
    List<String> distinct = new ArrayList<>(freqMap.keySet());
        Collections.sort(distinct);
        
    alphanumeric[] result = new alphanumeric[distinct.size()];
    for (int i = 0; i < distinct.size(); i++) {
        String s = distinct.get(i);
        result[i] = new alphanumeric(s, freqMap.get(s));
        }

        return result;
    }
}
