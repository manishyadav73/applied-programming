import java.util.*;

class Solution {
    public String frequencySort(String s) {
       
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        List<Character> chars = new ArrayList<>(counts.keySet());
       
        chars.sort((a, b) -> counts.get(b) - counts.get(a));
        
       
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int frequency = counts.get(c);
            for (int i = 0; i < frequency; i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}