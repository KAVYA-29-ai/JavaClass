import java.util.*;

class Geeks {
    public static void Election2019(String[] party, int[] seats, int n) {
        // TreeMap for lexicographic sorting of party names
        TreeMap<String, Integer> map = new TreeMap<>();
        
        int maxSeats = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            map.put(party[i], seats[i]);
            if (seats[i] > maxSeats) {
                maxSeats = seats[i];
            }
        }
        
        // print parties in lexicographic order with seats
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        // print max seats
        System.out.println(maxSeats);
    }
}
